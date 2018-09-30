
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:38 BST)
 */

        
            package org.ng.cdsa.pas.avail_nom_confirmation;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://pas.cdsa.ng.org/Avail_Nom_Confirmation".equals(namespaceURI) &&
                  "Avail_Nom_ConfirmationerviceType".equals(typeName)){
                   
                            return  org.ng.cdsa.pas.avail_nom_confirmation.Avail_Nom_ConfirmationerviceType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://pas.cdsa.ng.org/Avail_Nom_Confirmation".equals(namespaceURI) &&
                  "ServiceTypeType".equals(typeName)){
                   
                            return  org.ng.cdsa.pas.avail_nom_confirmation.ServiceTypeType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://pas.cdsa.ng.org/Avail_Nom_Confirmation".equals(namespaceURI) &&
                  "ContractIDType".equals(typeName)){
                   
                            return  org.ng.cdsa.pas.avail_nom_confirmation.ContractIDType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://pas.cdsa.ng.org/Avail_Nom_Confirmation".equals(namespaceURI) &&
                  "AUIType".equals(typeName)){
                   
                            return  org.ng.cdsa.pas.avail_nom_confirmation.AUIType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://pas.cdsa.ng.org/Avail_Nom_Confirmation".equals(namespaceURI) &&
                  "NUIType".equals(typeName)){
                   
                            return  org.ng.cdsa.pas.avail_nom_confirmation.NUIType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://pas.cdsa.ng.org/Avail_Nom_Confirmation".equals(namespaceURI) &&
                  "AvailabilityWindowType".equals(typeName)){
                   
                            return  org.ng.cdsa.pas.avail_nom_confirmation.AvailabilityWindowType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://pas.cdsa.ng.org/Avail_Nom_Confirmation".equals(namespaceURI) &&
                  "Resonsetype".equals(typeName)){
                   
                            return  org.ng.cdsa.pas.avail_nom_confirmation.Resonsetype.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://pas.cdsa.ng.org/Avail_Nom_Confirmation".equals(namespaceURI) &&
                  "ConfirmationType".equals(typeName)){
                   
                            return  org.ng.cdsa.pas.avail_nom_confirmation.ConfirmationType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://pas.cdsa.ng.org/Avail_Nom_Confirmation".equals(namespaceURI) &&
                  "Avail_Nom_ConfirmationReqServiceType".equals(typeName)){
                   
                            return  org.ng.cdsa.pas.avail_nom_confirmation.Avail_Nom_ConfirmationReqServiceType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://pas.cdsa.ng.org/Avail_Nom_Confirmation".equals(namespaceURI) &&
                  "faulttype".equals(typeName)){
                   
                            return  org.ng.cdsa.pas.avail_nom_confirmation.Faulttype.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://pas.cdsa.ng.org/Avail_Nom_Confirmation".equals(namespaceURI) &&
                  "ReasonType".equals(typeName)){
                   
                            return  org.ng.cdsa.pas.avail_nom_confirmation.ReasonType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    