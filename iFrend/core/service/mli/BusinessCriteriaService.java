package com.isg.ifrend.core.service.mli;

import java.util.Map;

/***
 * 
 * 
 * @author augusto.marte
 * 
 * Business Criteria team shall provide the implementation for this interface.
 * It will be then call from Ifrend context to validate it's user fields
 * prior to sending message to MLI
 * 
 * this Object type shall be injected for each ServiceImpl class in iFrend.
 *
 */


public interface BusinessCriteriaService {

		
		/**
		 */
		public abstract Map executeBusinessCriteriaRules(String functionID, Map userFieldIDMap);

			
			/**
			 */
			public abstract String lookupMessageCode(int mliCode);
			
		

}
