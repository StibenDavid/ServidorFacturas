package sop_corba;


/**
* sop_corba/_FacturaIntStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from factura.idl
* lunes 3 de julio de 2023 08:36:59 AM COT
*/

public class _FacturaIntStub extends org.omg.CORBA.portable.ObjectImpl implements sop_corba.FacturaInt
{

  public sop_corba.FacturaIntPackage.facturaDTO generarFactura (String nombres, String apellidos, String nombreProducto, float valorInicialOferta, float ValorFinalOferta)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("generarFactura", true);
                $out.write_string (nombres);
                $out.write_string (apellidos);
                $out.write_string (nombreProducto);
                $out.write_float (valorInicialOferta);
                $out.write_float (ValorFinalOferta);
                $in = _invoke ($out);
                sop_corba.FacturaIntPackage.facturaDTO $result = sop_corba.FacturaIntPackage.facturaDTOHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return generarFactura (nombres, apellidos, nombreProducto, valorInicialOferta, ValorFinalOferta        );
            } finally {
                _releaseReply ($in);
            }
  } // generarFactura

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/FacturaInt:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _FacturaIntStub
