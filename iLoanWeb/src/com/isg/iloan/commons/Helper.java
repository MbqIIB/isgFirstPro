package com.isg.iloan.commons;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Textbox;

import com.isg.iloan.controller.functions.dataEntry.NewApplicationViewCtrl;

public class Helper {

	private static Logger logger = Logger.getLogger(NewApplicationViewCtrl.class);
	
	public static void setProperties(Object obj, String[] fields, Map<String,Component> map) throws 
	              SecurityException,WrongValueException,IllegalAccessException,InvocationTargetException
	              
	{
		
		for(int i=0;i<fields.length;i++){
			Component comp = map.get(fields[i]);
			
				try {
					String methodName = String.format("set%C%s",fields[i].charAt(0), fields[i].substring(1));
					
					Method[] methods = obj.getClass().getDeclaredMethods();
					Map<String, Method> methodMap = new HashMap<String,Method>();
					for(int k=0;k<methods.length;k++){
						methodMap.put(methods[k].getName(), methods[k]);
					}
					Method method = methodMap.get(methodName);
					logger.debug("*** invoking methodName: " + method.getName() + "..");
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
					logger.debug("*** invoking methodName: " + method.getName() + "..finished!..");
				}finally{
					
				}				
			}
		}
	
	
	
	
}
