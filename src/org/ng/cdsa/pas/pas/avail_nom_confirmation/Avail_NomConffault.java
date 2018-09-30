
/**
 * Avail_NomConffault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */

package org.ng.cdsa.pas.pas.avail_nom_confirmation;

public class Avail_NomConffault extends java.lang.Exception{

    private static final long serialVersionUID = 1538145740032L;
    
    private org.ng.cdsa.pas.avail_nom_confirmation.Fault faultMessage;

    
        public Avail_NomConffault() {
            super("Avail_NomConffault");
        }

        public Avail_NomConffault(java.lang.String s) {
           super(s);
        }

        public Avail_NomConffault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public Avail_NomConffault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.ng.cdsa.pas.avail_nom_confirmation.Fault msg){
       faultMessage = msg;
    }
    
    public org.ng.cdsa.pas.avail_nom_confirmation.Fault getFaultMessage(){
       return faultMessage;
    }
}
    