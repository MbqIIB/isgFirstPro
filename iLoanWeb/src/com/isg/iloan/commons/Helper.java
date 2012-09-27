package com.isg.iloan.commons;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.ComponentNotFoundException;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Longbox;
import org.zkoss.zul.Textbox;

import com.isg.iloan.controller.functions.dataEntry.NewApplicationViewCtrl;
import com.isg.iloan.model.dataEntry.Address;

public class Helper {

	private static Logger logger = Logger.getLogger(NewApplicationViewCtrl.class);
	
	/**
	 *  ==== This method uses reflection to set properties of Model bean from zul component. ====
	 * @param obj -  the model object
	 * @param fields - the persistence field names
	 * @param window -  the enclosing window component of the page e.g - personalDataWindow, jobDetailWindow
	 * @throws SecurityException
	 * @throws WrongValueException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static void setProperties(Object obj, String[] fields, Component window) throws 
	              SecurityException,WrongValueException,IllegalAccessException,InvocationTargetException
	              
	{
		
		for(int i=0;i<fields.length;i++){
			//Component comp = map.get(fields[i]);
			Component comp = window.getFellow(fields[i]);
			
				try {
					String methodName = String.format("set%C%s",fields[i].charAt(0), fields[i].substring(1));
					
					Method[] methods = obj.getClass().getDeclaredMethods();
					Map<String, Method> methodMap = new HashMap<String,Method>();
					for(int k=0;k<methods.length;k++){
						methodMap.put(methods[k].getName(), methods[k]);
					}
					Method method = methodMap.get(methodName);
					logger.debug("*** invoking " + method.getName() + "..");
					if(comp instanceof Textbox){
						Class<?>[] paramClass = method.getParameterTypes();
						if(paramClass.length>0 && paramClass[0].getName().equals("long")){								
							method.invoke(obj, Long.valueOf(((Textbox)comp).getValue()));
						}else{
							method.invoke(obj, ((Textbox)comp).getValue());
						}
					}else if(comp instanceof Datebox){
						method.invoke(obj, ((Datebox)comp).getValue());
					}else if(comp instanceof Intbox){
						method.invoke(obj, ((Intbox)comp).getValue());
					}else if(comp instanceof Checkbox){
						method.invoke(obj, ((Checkbox)comp).isChecked());
					}
					logger.debug("*** invoking " + method.getName() + "..finished!..");
				}finally{
					
				}				
			}
		}
	
	
	
	/*** to be finished ****/
	
	public static List<String> setProperties(final Object obj, final Component window) throws 
		    SecurityException,WrongValueException,IllegalAccessException,InvocationTargetException
		    
		{
		
		List<String> failedMethods = new ArrayList<String>();		
		
		Method[] methods = obj.getClass().getDeclaredMethods();		
		for(int m=0;m<methods.length;m++){
			Method method = methods[m];
			if(method.getName()!=null && method.getName().startsWith("set")
					&& method.getParameterTypes().length==1){
				
					if((method.getParameterTypes()[0].isPrimitive() || 
							method.getParameterTypes()[0].getName().equals("java.lang.String"))
							){						
						String methodName = method.getName().replaceFirst("set", "");
						
						final int splitIndex = 1;				       
				        final String first = methodName.substring(0, splitIndex).toLowerCase();
				        final String rest = methodName.substring(splitIndex);
				        final StringBuilder sb = new StringBuilder(first).append(rest);
				        methodName = sb.toString();
				        logger.debug("*** reflected method: " + methodName);
				        Component comp ;
				        try{
				        	 comp = window.getFellow(methodName);
				        }catch(ComponentNotFoundException e){
				        	failedMethods.add(methodName);
				        	continue;
				        }
				        
				        if(null!=comp){
				        	
							if(comp instanceof Textbox){
								
									method.invoke(obj, ((Textbox)comp).getValue());
								
							}else if(comp instanceof Datebox){
								method.invoke(obj, ((Datebox)comp).getValue());
							}else if(comp instanceof Intbox){
								method.invoke(obj, ((Intbox)comp).getValue());
							}else if(comp instanceof Checkbox){
								method.invoke(obj, ((Checkbox)comp).isChecked());
							}else if(comp instanceof Longbox){
								method.invoke(obj, ((Longbox)comp).getValue());
							}
				        	
				        }else{
				        	failedMethods.add(methodName);
				        	continue;
				        	}
					}
				}
			}
		
		   return failedMethods;
		
		}
	
	
	public static List<String> setValues( final Component window, final Object obj) throws 
		    SecurityException,WrongValueException,IllegalAccessException,InvocationTargetException
		    
		{
		
		List<String> failedMethods = new ArrayList<String>();		
		
		Method[] methods = obj.getClass().getDeclaredMethods();		
		for(int m=0;m<methods.length;m++){
			Method method = methods[m];
			if(method.getName()!=null && method.getName().startsWith("get")){
				logger.debug("*** orig method: " + method.getName());
					if(method.getReturnType().isPrimitive() || 
							method.getReturnType().getName().equals("java.lang.String")
							|| method.getReturnType().getName().equals("java.util.Date") ){						
						String methodName = method.getName().replaceFirst("get", "");
						
						final int splitIndex = 1;				       
				        final String first = methodName.substring(0, splitIndex).toLowerCase();
				        final String rest = methodName.substring(splitIndex);
				        final StringBuilder sb = new StringBuilder(first).append(rest);
				        String formatted  = sb.toString();
				        logger.debug("*** reflected method: " + formatted);
				        Component comp;
				        try{
				        	 comp = window.getFellow(formatted);
				        }catch(ComponentNotFoundException e){
				        	failedMethods.add(formatted);
				        	continue;
				        }
				       
				        if(comp!=null){
				        	
							if(comp instanceof Textbox){							
									
									 ((Textbox)comp).setValue((String)method.invoke(obj));
							
							}else if(comp instanceof Datebox){
								 
								((Datebox)comp).setValue((Date)method.invoke(obj));
							}else if(comp instanceof Intbox){
								
								((Intbox)comp).setValue((Integer)method.invoke(obj));
							}else if(comp instanceof Checkbox){
								
								((Checkbox)comp).setChecked((Boolean)method.invoke(obj));
							}else if(comp instanceof Longbox){
								
								((Longbox)comp).setValue((Long)method.invoke(obj));
							}
				        	
				        }else{
				        	failedMethods.add(formatted);
				        	continue;
				        	}
					}
				}
			}
		
		   return failedMethods;
		
		}
	
	
	/*** use this with CAUTION: ids should be in proper order, 
	 *   index 0: addressLine1 id
	 *   index 1: zipCode id
	 *   index 2: telNum id
	 *   if Address does not have zip code, put an empty string "" in place of ids[1] index
	 * 
	 * */
	public static void setAddress(Component window, Address addr, String[] ids)
				throws SecurityException,WrongValueException,IllegalAccessException,InvocationTargetException{
		
		
		int length = ids.length;
		switch(length){
		case 1: if(null!=addr.getAddressLine1() && !addr.getAddressLine1().isEmpty())
				{
				((Textbox)window.getFellow(ids[0])).setValue(addr.getAddressLine1());
				}
		case 2:	if(null!=addr.getAddressLine1() && !addr.getAddressLine1().isEmpty())
				{
					((Textbox)window.getFellow(ids[0])).setValue(addr.getAddressLine1());
				}
				if(0!=addr.getZipCode()){
					((Intbox)window.getFellow(ids[1])).setValue(addr.getZipCode());
				}
				
		        
		case 3: 
				if(null!=addr.getAddressLine1() && !addr.getAddressLine1().isEmpty())
				{
					((Textbox)window.getFellow(ids[0])).setValue(addr.getAddressLine1());
				}				
				if(!ids[1].isEmpty() && 0!=addr.getZipCode() ){					
							
					((Intbox)window.getFellow(ids[1])).setValue(addr.getZipCode());
				} 
				if(null!=addr.getTelNum() && !addr.getTelNum().isEmpty()){
					((Textbox)window.getFellow(ids[2])).setValue(addr.getTelNum());		
				}
		}
		
				
	}
	
	
	
	
	
	
}
