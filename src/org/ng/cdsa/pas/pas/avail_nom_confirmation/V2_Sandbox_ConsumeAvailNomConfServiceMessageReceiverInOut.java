
/**
 * V2_Sandbox_ConsumeAvailNomConfServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
        package org.ng.cdsa.pas.pas.avail_nom_confirmation;

        /**
        *  V2_Sandbox_ConsumeAvailNomConfServiceMessageReceiverInOut message receiver
        */

        public class V2_Sandbox_ConsumeAvailNomConfServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        V2_Sandbox_ConsumeAvailNomConfServiceSkeleton skel = (V2_Sandbox_ConsumeAvailNomConfServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("availNomConfirmation".equals(methodName)){
                
                org.ng.cdsa.pas.avail_nom_confirmation.Response response5 = null;
	                        org.ng.cdsa.pas.avail_nom_confirmation.Avail_Nom_ConfirmationRequest wrappedParam =
                                                             (org.ng.cdsa.pas.avail_nom_confirmation.Avail_Nom_ConfirmationRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.ng.cdsa.pas.avail_nom_confirmation.Avail_Nom_ConfirmationRequest.class);
                                                
                                               response5 =
                                                   
                                                   
                                                         skel.availNomConfirmation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), response5, false,
                                                    new javax.xml.namespace.QName("http://pas.cdsa.ng.org/Avail_Nom_Confirmation", "Response"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (Avail_NomConffault e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"fault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.ng.cdsa.pas.avail_nom_confirmation.Avail_Nom_ConfirmationRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.ng.cdsa.pas.avail_nom_confirmation.Avail_Nom_ConfirmationRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.ng.cdsa.pas.avail_nom_confirmation.Response param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.ng.cdsa.pas.avail_nom_confirmation.Response.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.ng.cdsa.pas.avail_nom_confirmation.Fault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.ng.cdsa.pas.avail_nom_confirmation.Fault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.ng.cdsa.pas.avail_nom_confirmation.Response param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.ng.cdsa.pas.avail_nom_confirmation.Response.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.ng.cdsa.pas.avail_nom_confirmation.Response wrapAvailNomConfirmation(){
                                org.ng.cdsa.pas.avail_nom_confirmation.Response wrappedElement = new org.ng.cdsa.pas.avail_nom_confirmation.Response();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.ng.cdsa.pas.avail_nom_confirmation.Avail_Nom_ConfirmationRequest.class.equals(type)){
                
                        return org.ng.cdsa.pas.avail_nom_confirmation.Avail_Nom_ConfirmationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.ng.cdsa.pas.avail_nom_confirmation.Fault.class.equals(type)){
                
                        return org.ng.cdsa.pas.avail_nom_confirmation.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.ng.cdsa.pas.avail_nom_confirmation.Response.class.equals(type)){
                
                        return org.ng.cdsa.pas.avail_nom_confirmation.Response.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    