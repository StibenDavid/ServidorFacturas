package sop_corba;


/**
* sop_corba/FacturaIntPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from factura.idl
* lunes 3 de julio de 2023 11:49:09 AM COT
*/

public abstract class FacturaIntPOA extends org.omg.PortableServer.Servant
 implements sop_corba.FacturaIntOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("generarFactura", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // sop_corba/FacturaInt/generarFactura
       {
         sop_corba.FacturaIntPackage.facturaDTO datos = sop_corba.FacturaIntPackage.facturaDTOHelper.read (in);
         boolean $result = false;
         $result = this.generarFactura (datos);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/FacturaInt:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public FacturaInt _this() 
  {
    return FacturaIntHelper.narrow(
    super._this_object());
  }

  public FacturaInt _this(org.omg.CORBA.ORB orb) 
  {
    return FacturaIntHelper.narrow(
    super._this_object(orb));
  }


} // class FacturaIntPOA
