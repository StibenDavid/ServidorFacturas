package sop_corba.FacturaIntPackage;

/**
* sop_corba/FacturaIntPackage/facturaDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from factura.idl
* lunes 3 de julio de 2023 06:05:36 PM COT
*/

public final class facturaDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public sop_corba.FacturaIntPackage.facturaDTO value = null;

  public facturaDTOHolder ()
  {
  }

  public facturaDTOHolder (sop_corba.FacturaIntPackage.facturaDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.FacturaIntPackage.facturaDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.FacturaIntPackage.facturaDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.FacturaIntPackage.facturaDTOHelper.type ();
  }

}
