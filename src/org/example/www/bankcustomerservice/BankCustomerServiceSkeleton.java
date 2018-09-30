
/**
 * BankCustomerServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
    package org.example.www.bankcustomerservice;



/**
     *  BankCustomerServiceSkeleton java skeleton for the axisService
     */
    public class BankCustomerServiceSkeleton implements BankCustomerServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param newOperation0 
             * @return newOperationResponse1 
         */
        
                 public org.example.www.bankcustomerservice.NewOperationResponse newOperation
                  (
                  org.example.www.bankcustomerservice.NewOperation newOperation0
                  )
            {
                //TODO : fill this with the necessary business logic
                	 
                	 NewOperationResponse responseMsg=new NewOperationResponse();
               	  try {
               	  System.out.println(" Request received for - NewOperation - "+ newOperation0.toString());
               	    String localIn= newOperation0.getIn();
               	    System.out.println(localIn);
//               	    String reply="200 OK";
//               	    ReplyType response = new ReplyType();
//               	    response.setReplyType(reply);
//               	    responseMsg = new Availability_Nomination_ResponseMessage();
//               	    responseMsg.setContractID(contactID);
               	    
               	    responseMsg.setOut("Param:"+localIn);
               	
               	  } catch(Exception ex) {
               		  
               		  ex.printStackTrace();
               		  throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#NewOperation");
               	  }
               	    return responseMsg;
                	 
               // throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#newOperation");
        }
     
    }
    