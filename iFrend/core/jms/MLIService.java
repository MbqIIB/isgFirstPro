package com.isg.ifrend.core.jms;


public abstract class MLIService {

		
		/**
		 */
		public void configure(String destination, String queue){
		}

			
			/**
			 */
			public String sendMessage(Object textMessage){
				return "";	
			}


				
				/**
				 */
				public Object receiveMessage(){
					return null;
				}

}
