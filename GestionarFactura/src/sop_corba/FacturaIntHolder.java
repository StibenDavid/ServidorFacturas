package sop_corba;

/**
* sop_corba/FacturaIntHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from factura.idl
* lunes 3 de julio de 2023 06:05:36 PM COT
*/

public final class FacturaIntHolder implements org.omg.CORBA.portable.Streamable
{
  public sop_corba.FacturaInt value = null;

  public FacturaIntHolder ()
  {
  }

  public FacturaIntHolder (sop_corba.FacturaInt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.FacturaIntHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.FacturaIntHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.FacturaIntHelper.type ();
  }

}
