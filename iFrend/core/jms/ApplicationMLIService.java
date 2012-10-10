package com.isg.ifrend.core.jms;

import com.isg.ifrend.core.model.mli.dto.ApplicationCreateDTO;
import com.isg.ifrend.core.model.mli.dto.ApplicationInquiryDTO;
import java.util.List;


public interface ApplicationMLIService {

		
		/**
		 */
		public abstract List requestApplicationInquiry(ApplicationInquiryDTO dto);

			
			/**
			 */
			public abstract String requestCreateApplication(ApplicationCreateDTO dto);
			
		

}
