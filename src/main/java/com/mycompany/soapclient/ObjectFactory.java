
package com.mycompany.soapclient;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.soapclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CompositeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CompositeType");
    private final static QName _ArrayOfSesion_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfSesion");
    private final static QName _Sesion_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Sesion");
    private final static QName _ArrayOfUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfUsuario");
    private final static QName _Usuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Usuario");
    private final static QName _ArrayOfCancha_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfCancha");
    private final static QName _Cancha_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Cancha");
    private final static QName _ArrayOfReservaPendiente_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfReservaPendiente");
    private final static QName _ReservaPendiente_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ReservaPendiente");
    private final static QName _ArrayOfHorario_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfHorario");
    private final static QName _Horario_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Horario");
    private final static QName _ArrayOfHistorialReserva_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfHistorialReserva");
    private final static QName _HistorialReserva_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "HistorialReserva");
    private final static QName _ArrayOfReserva_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfReserva");
    private final static QName _Reserva_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Reserva");
    private final static QName _ArrayOfTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfTipo");
    private final static QName _Tipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Tipo");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _GetDataResponseGetDataResult_QNAME = new QName("http://tempuri.org/", "GetDataResult");
    private final static QName _GetDataUsingDataContractComposite_QNAME = new QName("http://tempuri.org/", "composite");
    private final static QName _GetDataUsingDataContractResponseGetDataUsingDataContractResult_QNAME = new QName("http://tempuri.org/", "GetDataUsingDataContractResult");
    private final static QName _ValidarUsuarioLogin_QNAME = new QName("http://tempuri.org/", "login");
    private final static QName _ValidarUsuarioPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _ValidarUsuarioResponseValidarUsuarioResult_QNAME = new QName("http://tempuri.org/", "ValidarUsuarioResult");
    private final static QName _InsertarUsuarioEmail_QNAME = new QName("http://tempuri.org/", "email");
    private final static QName _InsertarUsuarioNombre_QNAME = new QName("http://tempuri.org/", "nombre");
    private final static QName _InsertarUsuarioApellido_QNAME = new QName("http://tempuri.org/", "apellido");
    private final static QName _InsertarUsuarioTelefono_QNAME = new QName("http://tempuri.org/", "telefono");
    private final static QName _InsertarUsuarioResponseInsertarUsuarioResult_QNAME = new QName("http://tempuri.org/", "InsertarUsuarioResult");
    private final static QName _MostrarDatosResponseMostrarDatosResult_QNAME = new QName("http://tempuri.org/", "MostrarDatosResult");
    private final static QName _EliminarUsuarioResponseEliminarUsuarioResult_QNAME = new QName("http://tempuri.org/", "EliminarUsuarioResult");
    private final static QName _ActualizarUsuarioResponseActualizarUsuarioResult_QNAME = new QName("http://tempuri.org/", "ActualizarUsuarioResult");
    private final static QName _MostrarCanchasTipo_QNAME = new QName("http://tempuri.org/", "tipo");
    private final static QName _MostrarCanchasNumeroCanchas_QNAME = new QName("http://tempuri.org/", "numeroCanchas");
    private final static QName _MostrarCanchasEstados_QNAME = new QName("http://tempuri.org/", "estados");
    private final static QName _MostrarCanchasResponseMostrarCanchasResult_QNAME = new QName("http://tempuri.org/", "MostrarCanchasResult");
    private final static QName _EliminarCanchaResponseEliminarCanchaResult_QNAME = new QName("http://tempuri.org/", "EliminarCanchaResult");
    private final static QName _InsertarCanchaUbicacion_QNAME = new QName("http://tempuri.org/", "ubicacion");
    private final static QName _InsertarCanchaResponseInsertarCanchaResult_QNAME = new QName("http://tempuri.org/", "InsertarCanchaResult");
    private final static QName _ActualizarCanchaResponseActualizarCanchaResult_QNAME = new QName("http://tempuri.org/", "ActualizarCanchaResult");
    private final static QName _MostrarSolicitudesCorreo_QNAME = new QName("http://tempuri.org/", "correo");
    private final static QName _MostrarSolicitudesResponseMostrarSolicitudesResult_QNAME = new QName("http://tempuri.org/", "MostrarSolicitudesResult");
    private final static QName _InsertarSolicitudCancha_QNAME = new QName("http://tempuri.org/", "cancha");
    private final static QName _InsertarSolicitudFechaSolicitadaStr_QNAME = new QName("http://tempuri.org/", "fechaSolicitadaStr");
    private final static QName _InsertarSolicitudHoraSolicitadaStr_QNAME = new QName("http://tempuri.org/", "horaSolicitadaStr");
    private final static QName _InsertarSolicitudHoraFinalizacionStr_QNAME = new QName("http://tempuri.org/", "horaFinalizacionStr");
    private final static QName _InsertarSolicitudMotivo_QNAME = new QName("http://tempuri.org/", "motivo");
    private final static QName _InsertarSolicitudEstado_QNAME = new QName("http://tempuri.org/", "estado");
    private final static QName _InsertarSolicitudResponseInsertarSolicitudResult_QNAME = new QName("http://tempuri.org/", "InsertarSolicitudResult");
    private final static QName _ActualizarSolicitudResponseActualizarSolicitudResult_QNAME = new QName("http://tempuri.org/", "ActualizarSolicitudResult");
    private final static QName _EliminarSolicitudResponseEliminarSolicitudResult_QNAME = new QName("http://tempuri.org/", "EliminarSolicitudResult");
    private final static QName _InsertarHorarioFechaStr_QNAME = new QName("http://tempuri.org/", "fechaStr");
    private final static QName _InsertarHorarioHoraInicialStr_QNAME = new QName("http://tempuri.org/", "horaInicialStr");
    private final static QName _InsertarHorarioHoraFinalStr_QNAME = new QName("http://tempuri.org/", "horaFinalStr");
    private final static QName _InsertarHorarioResponseInsertarHorarioResult_QNAME = new QName("http://tempuri.org/", "InsertarHorarioResult");
    private final static QName _MostrarHorariosDia_QNAME = new QName("http://tempuri.org/", "dia");
    private final static QName _MostrarHorariosHoraInicial_QNAME = new QName("http://tempuri.org/", "horaInicial");
    private final static QName _MostrarHorariosHoraFinal_QNAME = new QName("http://tempuri.org/", "horaFinal");
    private final static QName _MostrarHorariosResponseMostrarHorariosResult_QNAME = new QName("http://tempuri.org/", "MostrarHorariosResult");
    private final static QName _ActualizarHorarioDiaStr_QNAME = new QName("http://tempuri.org/", "diaStr");
    private final static QName _ActualizarHorarioResponseActualizarHorarioResult_QNAME = new QName("http://tempuri.org/", "ActualizarHorarioResult");
    private final static QName _EliminarHorarioResponseEliminarHorarioResult_QNAME = new QName("http://tempuri.org/", "EliminarHorarioResult");
    private final static QName _MostrarHistorialReservasEstadoReserva_QNAME = new QName("http://tempuri.org/", "estadoReserva");
    private final static QName _MostrarHistorialReservasResponseMostrarHistorialReservasResult_QNAME = new QName("http://tempuri.org/", "MostrarHistorialReservasResult");
    private final static QName _MostrarReservasResponseMostrarReservasResult_QNAME = new QName("http://tempuri.org/", "MostrarReservasResult");
    private final static QName _InsertarTipoResponseInsertarTipoResult_QNAME = new QName("http://tempuri.org/", "InsertarTipoResult");
    private final static QName _EliminarTipoResponseEliminarTipoResult_QNAME = new QName("http://tempuri.org/", "EliminarTipoResult");
    private final static QName _ActualizarTipoResponseActualizarTipoResult_QNAME = new QName("http://tempuri.org/", "ActualizarTipoResult");
    private final static QName _MostrarTiposResponseMostrarTiposResult_QNAME = new QName("http://tempuri.org/", "MostrarTiposResult");
    private final static QName _ActualizarContrasenaNewPassword_QNAME = new QName("http://tempuri.org/", "newPassword");
    private final static QName _ActualizarContrasenaResponseActualizarContrasenaResult_QNAME = new QName("http://tempuri.org/", "ActualizarContrasenaResult");
    private final static QName _TipoNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Nombre");
    private final static QName _ReservaApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Apellido");
    private final static QName _ReservaCorreo_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Correo");
    private final static QName _ReservaHora_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Hora");
    private final static QName _HistorialReservaEstadoReserva_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "EstadoReserva");
    private final static QName _HorarioHoraFinal_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "HoraFinal");
    private final static QName _HorarioHoraInicial_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "HoraInicial");
    private final static QName _ReservaPendienteEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Estado");
    private final static QName _ReservaPendienteMotivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Motivo");
    private final static QName _CanchaDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Direccion");
    private final static QName _UsuarioEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Email");
    private final static QName _UsuarioLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Login");
    private final static QName _UsuarioPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Password");
    private final static QName _UsuarioTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Telefono");
    private final static QName _CompositeTypeStringValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "StringValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.soapclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link GetDataUsingDataContract }
     * 
     */
    public GetDataUsingDataContract createGetDataUsingDataContract() {
        return new GetDataUsingDataContract();
    }

    /**
     * Create an instance of {@link CompositeType }
     * 
     */
    public CompositeType createCompositeType() {
        return new CompositeType();
    }

    /**
     * Create an instance of {@link GetDataUsingDataContractResponse }
     * 
     */
    public GetDataUsingDataContractResponse createGetDataUsingDataContractResponse() {
        return new GetDataUsingDataContractResponse();
    }

    /**
     * Create an instance of {@link ValidarUsuario }
     * 
     */
    public ValidarUsuario createValidarUsuario() {
        return new ValidarUsuario();
    }

    /**
     * Create an instance of {@link ValidarUsuarioResponse }
     * 
     */
    public ValidarUsuarioResponse createValidarUsuarioResponse() {
        return new ValidarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSesion }
     * 
     */
    public ArrayOfSesion createArrayOfSesion() {
        return new ArrayOfSesion();
    }

    /**
     * Create an instance of {@link InsertarUsuario }
     * 
     */
    public InsertarUsuario createInsertarUsuario() {
        return new InsertarUsuario();
    }

    /**
     * Create an instance of {@link InsertarUsuarioResponse }
     * 
     */
    public InsertarUsuarioResponse createInsertarUsuarioResponse() {
        return new InsertarUsuarioResponse();
    }

    /**
     * Create an instance of {@link MostrarDatos }
     * 
     */
    public MostrarDatos createMostrarDatos() {
        return new MostrarDatos();
    }

    /**
     * Create an instance of {@link MostrarDatosResponse }
     * 
     */
    public MostrarDatosResponse createMostrarDatosResponse() {
        return new MostrarDatosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUsuario }
     * 
     */
    public ArrayOfUsuario createArrayOfUsuario() {
        return new ArrayOfUsuario();
    }

    /**
     * Create an instance of {@link EliminarUsuario }
     * 
     */
    public EliminarUsuario createEliminarUsuario() {
        return new EliminarUsuario();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ActualizarUsuario }
     * 
     */
    public ActualizarUsuario createActualizarUsuario() {
        return new ActualizarUsuario();
    }

    /**
     * Create an instance of {@link ActualizarUsuarioResponse }
     * 
     */
    public ActualizarUsuarioResponse createActualizarUsuarioResponse() {
        return new ActualizarUsuarioResponse();
    }

    /**
     * Create an instance of {@link MostrarCanchas }
     * 
     */
    public MostrarCanchas createMostrarCanchas() {
        return new MostrarCanchas();
    }

    /**
     * Create an instance of {@link MostrarCanchasResponse }
     * 
     */
    public MostrarCanchasResponse createMostrarCanchasResponse() {
        return new MostrarCanchasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCancha }
     * 
     */
    public ArrayOfCancha createArrayOfCancha() {
        return new ArrayOfCancha();
    }

    /**
     * Create an instance of {@link EliminarCancha }
     * 
     */
    public EliminarCancha createEliminarCancha() {
        return new EliminarCancha();
    }

    /**
     * Create an instance of {@link EliminarCanchaResponse }
     * 
     */
    public EliminarCanchaResponse createEliminarCanchaResponse() {
        return new EliminarCanchaResponse();
    }

    /**
     * Create an instance of {@link InsertarCancha }
     * 
     */
    public InsertarCancha createInsertarCancha() {
        return new InsertarCancha();
    }

    /**
     * Create an instance of {@link InsertarCanchaResponse }
     * 
     */
    public InsertarCanchaResponse createInsertarCanchaResponse() {
        return new InsertarCanchaResponse();
    }

    /**
     * Create an instance of {@link ActualizarCancha }
     * 
     */
    public ActualizarCancha createActualizarCancha() {
        return new ActualizarCancha();
    }

    /**
     * Create an instance of {@link ActualizarCanchaResponse }
     * 
     */
    public ActualizarCanchaResponse createActualizarCanchaResponse() {
        return new ActualizarCanchaResponse();
    }

    /**
     * Create an instance of {@link MostrarSolicitudes }
     * 
     */
    public MostrarSolicitudes createMostrarSolicitudes() {
        return new MostrarSolicitudes();
    }

    /**
     * Create an instance of {@link MostrarSolicitudesResponse }
     * 
     */
    public MostrarSolicitudesResponse createMostrarSolicitudesResponse() {
        return new MostrarSolicitudesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfReservaPendiente }
     * 
     */
    public ArrayOfReservaPendiente createArrayOfReservaPendiente() {
        return new ArrayOfReservaPendiente();
    }

    /**
     * Create an instance of {@link InsertarSolicitud }
     * 
     */
    public InsertarSolicitud createInsertarSolicitud() {
        return new InsertarSolicitud();
    }

    /**
     * Create an instance of {@link InsertarSolicitudResponse }
     * 
     */
    public InsertarSolicitudResponse createInsertarSolicitudResponse() {
        return new InsertarSolicitudResponse();
    }

    /**
     * Create an instance of {@link ActualizarSolicitud }
     * 
     */
    public ActualizarSolicitud createActualizarSolicitud() {
        return new ActualizarSolicitud();
    }

    /**
     * Create an instance of {@link ActualizarSolicitudResponse }
     * 
     */
    public ActualizarSolicitudResponse createActualizarSolicitudResponse() {
        return new ActualizarSolicitudResponse();
    }

    /**
     * Create an instance of {@link EliminarSolicitud }
     * 
     */
    public EliminarSolicitud createEliminarSolicitud() {
        return new EliminarSolicitud();
    }

    /**
     * Create an instance of {@link EliminarSolicitudResponse }
     * 
     */
    public EliminarSolicitudResponse createEliminarSolicitudResponse() {
        return new EliminarSolicitudResponse();
    }

    /**
     * Create an instance of {@link InsertarHorario }
     * 
     */
    public InsertarHorario createInsertarHorario() {
        return new InsertarHorario();
    }

    /**
     * Create an instance of {@link InsertarHorarioResponse }
     * 
     */
    public InsertarHorarioResponse createInsertarHorarioResponse() {
        return new InsertarHorarioResponse();
    }

    /**
     * Create an instance of {@link MostrarHorarios }
     * 
     */
    public MostrarHorarios createMostrarHorarios() {
        return new MostrarHorarios();
    }

    /**
     * Create an instance of {@link MostrarHorariosResponse }
     * 
     */
    public MostrarHorariosResponse createMostrarHorariosResponse() {
        return new MostrarHorariosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHorario }
     * 
     */
    public ArrayOfHorario createArrayOfHorario() {
        return new ArrayOfHorario();
    }

    /**
     * Create an instance of {@link ActualizarHorario }
     * 
     */
    public ActualizarHorario createActualizarHorario() {
        return new ActualizarHorario();
    }

    /**
     * Create an instance of {@link ActualizarHorarioResponse }
     * 
     */
    public ActualizarHorarioResponse createActualizarHorarioResponse() {
        return new ActualizarHorarioResponse();
    }

    /**
     * Create an instance of {@link EliminarHorario }
     * 
     */
    public EliminarHorario createEliminarHorario() {
        return new EliminarHorario();
    }

    /**
     * Create an instance of {@link EliminarHorarioResponse }
     * 
     */
    public EliminarHorarioResponse createEliminarHorarioResponse() {
        return new EliminarHorarioResponse();
    }

    /**
     * Create an instance of {@link MostrarHistorialReservas }
     * 
     */
    public MostrarHistorialReservas createMostrarHistorialReservas() {
        return new MostrarHistorialReservas();
    }

    /**
     * Create an instance of {@link MostrarHistorialReservasResponse }
     * 
     */
    public MostrarHistorialReservasResponse createMostrarHistorialReservasResponse() {
        return new MostrarHistorialReservasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHistorialReserva }
     * 
     */
    public ArrayOfHistorialReserva createArrayOfHistorialReserva() {
        return new ArrayOfHistorialReserva();
    }

    /**
     * Create an instance of {@link MostrarReservas }
     * 
     */
    public MostrarReservas createMostrarReservas() {
        return new MostrarReservas();
    }

    /**
     * Create an instance of {@link MostrarReservasResponse }
     * 
     */
    public MostrarReservasResponse createMostrarReservasResponse() {
        return new MostrarReservasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfReserva }
     * 
     */
    public ArrayOfReserva createArrayOfReserva() {
        return new ArrayOfReserva();
    }

    /**
     * Create an instance of {@link InsertarTipo }
     * 
     */
    public InsertarTipo createInsertarTipo() {
        return new InsertarTipo();
    }

    /**
     * Create an instance of {@link InsertarTipoResponse }
     * 
     */
    public InsertarTipoResponse createInsertarTipoResponse() {
        return new InsertarTipoResponse();
    }

    /**
     * Create an instance of {@link EliminarTipo }
     * 
     */
    public EliminarTipo createEliminarTipo() {
        return new EliminarTipo();
    }

    /**
     * Create an instance of {@link EliminarTipoResponse }
     * 
     */
    public EliminarTipoResponse createEliminarTipoResponse() {
        return new EliminarTipoResponse();
    }

    /**
     * Create an instance of {@link ActualizarTipo }
     * 
     */
    public ActualizarTipo createActualizarTipo() {
        return new ActualizarTipo();
    }

    /**
     * Create an instance of {@link ActualizarTipoResponse }
     * 
     */
    public ActualizarTipoResponse createActualizarTipoResponse() {
        return new ActualizarTipoResponse();
    }

    /**
     * Create an instance of {@link MostrarTipos }
     * 
     */
    public MostrarTipos createMostrarTipos() {
        return new MostrarTipos();
    }

    /**
     * Create an instance of {@link MostrarTiposResponse }
     * 
     */
    public MostrarTiposResponse createMostrarTiposResponse() {
        return new MostrarTiposResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTipo }
     * 
     */
    public ArrayOfTipo createArrayOfTipo() {
        return new ArrayOfTipo();
    }

    /**
     * Create an instance of {@link ActualizarContrasena }
     * 
     */
    public ActualizarContrasena createActualizarContrasena() {
        return new ActualizarContrasena();
    }

    /**
     * Create an instance of {@link ActualizarContrasenaResponse }
     * 
     */
    public ActualizarContrasenaResponse createActualizarContrasenaResponse() {
        return new ActualizarContrasenaResponse();
    }

    /**
     * Create an instance of {@link Sesion }
     * 
     */
    public Sesion createSesion() {
        return new Sesion();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Cancha }
     * 
     */
    public Cancha createCancha() {
        return new Cancha();
    }

    /**
     * Create an instance of {@link ReservaPendiente }
     * 
     */
    public ReservaPendiente createReservaPendiente() {
        return new ReservaPendiente();
    }

    /**
     * Create an instance of {@link Horario }
     * 
     */
    public Horario createHorario() {
        return new Horario();
    }

    /**
     * Create an instance of {@link HistorialReserva }
     * 
     */
    public HistorialReserva createHistorialReserva() {
        return new HistorialReserva();
    }

    /**
     * Create an instance of {@link Reserva }
     * 
     */
    public Reserva createReserva() {
        return new Reserva();
    }

    /**
     * Create an instance of {@link Tipo }
     * 
     */
    public Tipo createTipo() {
        return new Tipo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompositeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CompositeType")
    public JAXBElement<CompositeType> createCompositeType(CompositeType value) {
        return new JAXBElement<CompositeType>(_CompositeType_QNAME, CompositeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSesion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSesion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfSesion")
    public JAXBElement<ArrayOfSesion> createArrayOfSesion(ArrayOfSesion value) {
        return new JAXBElement<ArrayOfSesion>(_ArrayOfSesion_QNAME, ArrayOfSesion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sesion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sesion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Sesion")
    public JAXBElement<Sesion> createSesion(Sesion value) {
        return new JAXBElement<Sesion>(_Sesion_QNAME, Sesion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfUsuario")
    public JAXBElement<ArrayOfUsuario> createArrayOfUsuario(ArrayOfUsuario value) {
        return new JAXBElement<ArrayOfUsuario>(_ArrayOfUsuario_QNAME, ArrayOfUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCancha }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCancha }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfCancha")
    public JAXBElement<ArrayOfCancha> createArrayOfCancha(ArrayOfCancha value) {
        return new JAXBElement<ArrayOfCancha>(_ArrayOfCancha_QNAME, ArrayOfCancha.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cancha }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cancha }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Cancha")
    public JAXBElement<Cancha> createCancha(Cancha value) {
        return new JAXBElement<Cancha>(_Cancha_QNAME, Cancha.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReservaPendiente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReservaPendiente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfReservaPendiente")
    public JAXBElement<ArrayOfReservaPendiente> createArrayOfReservaPendiente(ArrayOfReservaPendiente value) {
        return new JAXBElement<ArrayOfReservaPendiente>(_ArrayOfReservaPendiente_QNAME, ArrayOfReservaPendiente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaPendiente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReservaPendiente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ReservaPendiente")
    public JAXBElement<ReservaPendiente> createReservaPendiente(ReservaPendiente value) {
        return new JAXBElement<ReservaPendiente>(_ReservaPendiente_QNAME, ReservaPendiente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHorario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfHorario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfHorario")
    public JAXBElement<ArrayOfHorario> createArrayOfHorario(ArrayOfHorario value) {
        return new JAXBElement<ArrayOfHorario>(_ArrayOfHorario_QNAME, ArrayOfHorario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Horario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Horario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Horario")
    public JAXBElement<Horario> createHorario(Horario value) {
        return new JAXBElement<Horario>(_Horario_QNAME, Horario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistorialReserva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfHistorialReserva }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfHistorialReserva")
    public JAXBElement<ArrayOfHistorialReserva> createArrayOfHistorialReserva(ArrayOfHistorialReserva value) {
        return new JAXBElement<ArrayOfHistorialReserva>(_ArrayOfHistorialReserva_QNAME, ArrayOfHistorialReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistorialReserva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HistorialReserva }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "HistorialReserva")
    public JAXBElement<HistorialReserva> createHistorialReserva(HistorialReserva value) {
        return new JAXBElement<HistorialReserva>(_HistorialReserva_QNAME, HistorialReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReserva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReserva }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfReserva")
    public JAXBElement<ArrayOfReserva> createArrayOfReserva(ArrayOfReserva value) {
        return new JAXBElement<ArrayOfReserva>(_ArrayOfReserva_QNAME, ArrayOfReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reserva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Reserva }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Reserva")
    public JAXBElement<Reserva> createReserva(Reserva value) {
        return new JAXBElement<Reserva>(_Reserva_QNAME, Reserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfTipo")
    public JAXBElement<ArrayOfTipo> createArrayOfTipo(ArrayOfTipo value) {
        return new JAXBElement<ArrayOfTipo>(_ArrayOfTipo_QNAME, ArrayOfTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Tipo")
    public JAXBElement<Tipo> createTipo(Tipo value) {
        return new JAXBElement<Tipo>(_Tipo_QNAME, Tipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataResult", scope = GetDataResponse.class)
    public JAXBElement<String> createGetDataResponseGetDataResult(String value) {
        return new JAXBElement<String>(_GetDataResponseGetDataResult_QNAME, String.class, GetDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompositeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "composite", scope = GetDataUsingDataContract.class)
    public JAXBElement<CompositeType> createGetDataUsingDataContractComposite(CompositeType value) {
        return new JAXBElement<CompositeType>(_GetDataUsingDataContractComposite_QNAME, CompositeType.class, GetDataUsingDataContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompositeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataUsingDataContractResult", scope = GetDataUsingDataContractResponse.class)
    public JAXBElement<CompositeType> createGetDataUsingDataContractResponseGetDataUsingDataContractResult(CompositeType value) {
        return new JAXBElement<CompositeType>(_GetDataUsingDataContractResponseGetDataUsingDataContractResult_QNAME, CompositeType.class, GetDataUsingDataContractResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = ValidarUsuario.class)
    public JAXBElement<String> createValidarUsuarioLogin(String value) {
        return new JAXBElement<String>(_ValidarUsuarioLogin_QNAME, String.class, ValidarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = ValidarUsuario.class)
    public JAXBElement<String> createValidarUsuarioPassword(String value) {
        return new JAXBElement<String>(_ValidarUsuarioPassword_QNAME, String.class, ValidarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSesion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSesion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ValidarUsuarioResult", scope = ValidarUsuarioResponse.class)
    public JAXBElement<ArrayOfSesion> createValidarUsuarioResponseValidarUsuarioResult(ArrayOfSesion value) {
        return new JAXBElement<ArrayOfSesion>(_ValidarUsuarioResponseValidarUsuarioResult_QNAME, ArrayOfSesion.class, ValidarUsuarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = InsertarUsuario.class)
    public JAXBElement<String> createInsertarUsuarioLogin(String value) {
        return new JAXBElement<String>(_ValidarUsuarioLogin_QNAME, String.class, InsertarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = InsertarUsuario.class)
    public JAXBElement<String> createInsertarUsuarioPassword(String value) {
        return new JAXBElement<String>(_ValidarUsuarioPassword_QNAME, String.class, InsertarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "email", scope = InsertarUsuario.class)
    public JAXBElement<String> createInsertarUsuarioEmail(String value) {
        return new JAXBElement<String>(_InsertarUsuarioEmail_QNAME, String.class, InsertarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = InsertarUsuario.class)
    public JAXBElement<String> createInsertarUsuarioNombre(String value) {
        return new JAXBElement<String>(_InsertarUsuarioNombre_QNAME, String.class, InsertarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apellido", scope = InsertarUsuario.class)
    public JAXBElement<String> createInsertarUsuarioApellido(String value) {
        return new JAXBElement<String>(_InsertarUsuarioApellido_QNAME, String.class, InsertarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "telefono", scope = InsertarUsuario.class)
    public JAXBElement<String> createInsertarUsuarioTelefono(String value) {
        return new JAXBElement<String>(_InsertarUsuarioTelefono_QNAME, String.class, InsertarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InsertarUsuarioResult", scope = InsertarUsuarioResponse.class)
    public JAXBElement<String> createInsertarUsuarioResponseInsertarUsuarioResult(String value) {
        return new JAXBElement<String>(_InsertarUsuarioResponseInsertarUsuarioResult_QNAME, String.class, InsertarUsuarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MostrarDatosResult", scope = MostrarDatosResponse.class)
    public JAXBElement<ArrayOfUsuario> createMostrarDatosResponseMostrarDatosResult(ArrayOfUsuario value) {
        return new JAXBElement<ArrayOfUsuario>(_MostrarDatosResponseMostrarDatosResult_QNAME, ArrayOfUsuario.class, MostrarDatosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EliminarUsuarioResult", scope = EliminarUsuarioResponse.class)
    public JAXBElement<String> createEliminarUsuarioResponseEliminarUsuarioResult(String value) {
        return new JAXBElement<String>(_EliminarUsuarioResponseEliminarUsuarioResult_QNAME, String.class, EliminarUsuarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = ActualizarUsuario.class)
    public JAXBElement<String> createActualizarUsuarioLogin(String value) {
        return new JAXBElement<String>(_ValidarUsuarioLogin_QNAME, String.class, ActualizarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = ActualizarUsuario.class)
    public JAXBElement<String> createActualizarUsuarioNombre(String value) {
        return new JAXBElement<String>(_InsertarUsuarioNombre_QNAME, String.class, ActualizarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apellido", scope = ActualizarUsuario.class)
    public JAXBElement<String> createActualizarUsuarioApellido(String value) {
        return new JAXBElement<String>(_InsertarUsuarioApellido_QNAME, String.class, ActualizarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "email", scope = ActualizarUsuario.class)
    public JAXBElement<String> createActualizarUsuarioEmail(String value) {
        return new JAXBElement<String>(_InsertarUsuarioEmail_QNAME, String.class, ActualizarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "telefono", scope = ActualizarUsuario.class)
    public JAXBElement<String> createActualizarUsuarioTelefono(String value) {
        return new JAXBElement<String>(_InsertarUsuarioTelefono_QNAME, String.class, ActualizarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ActualizarUsuarioResult", scope = ActualizarUsuarioResponse.class)
    public JAXBElement<String> createActualizarUsuarioResponseActualizarUsuarioResult(String value) {
        return new JAXBElement<String>(_ActualizarUsuarioResponseActualizarUsuarioResult_QNAME, String.class, ActualizarUsuarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tipo", scope = MostrarCanchas.class)
    public JAXBElement<String> createMostrarCanchasTipo(String value) {
        return new JAXBElement<String>(_MostrarCanchasTipo_QNAME, String.class, MostrarCanchas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = MostrarCanchas.class)
    public JAXBElement<String> createMostrarCanchasNombre(String value) {
        return new JAXBElement<String>(_InsertarUsuarioNombre_QNAME, String.class, MostrarCanchas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroCanchas", scope = MostrarCanchas.class)
    public JAXBElement<String> createMostrarCanchasNumeroCanchas(String value) {
        return new JAXBElement<String>(_MostrarCanchasNumeroCanchas_QNAME, String.class, MostrarCanchas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "estados", scope = MostrarCanchas.class)
    public JAXBElement<String> createMostrarCanchasEstados(String value) {
        return new JAXBElement<String>(_MostrarCanchasEstados_QNAME, String.class, MostrarCanchas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCancha }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCancha }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MostrarCanchasResult", scope = MostrarCanchasResponse.class)
    public JAXBElement<ArrayOfCancha> createMostrarCanchasResponseMostrarCanchasResult(ArrayOfCancha value) {
        return new JAXBElement<ArrayOfCancha>(_MostrarCanchasResponseMostrarCanchasResult_QNAME, ArrayOfCancha.class, MostrarCanchasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EliminarCanchaResult", scope = EliminarCanchaResponse.class)
    public JAXBElement<String> createEliminarCanchaResponseEliminarCanchaResult(String value) {
        return new JAXBElement<String>(_EliminarCanchaResponseEliminarCanchaResult_QNAME, String.class, EliminarCanchaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = InsertarCancha.class)
    public JAXBElement<String> createInsertarCanchaNombre(String value) {
        return new JAXBElement<String>(_InsertarUsuarioNombre_QNAME, String.class, InsertarCancha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tipo", scope = InsertarCancha.class)
    public JAXBElement<String> createInsertarCanchaTipo(String value) {
        return new JAXBElement<String>(_MostrarCanchasTipo_QNAME, String.class, InsertarCancha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ubicacion", scope = InsertarCancha.class)
    public JAXBElement<String> createInsertarCanchaUbicacion(String value) {
        return new JAXBElement<String>(_InsertarCanchaUbicacion_QNAME, String.class, InsertarCancha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InsertarCanchaResult", scope = InsertarCanchaResponse.class)
    public JAXBElement<String> createInsertarCanchaResponseInsertarCanchaResult(String value) {
        return new JAXBElement<String>(_InsertarCanchaResponseInsertarCanchaResult_QNAME, String.class, InsertarCanchaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = ActualizarCancha.class)
    public JAXBElement<String> createActualizarCanchaNombre(String value) {
        return new JAXBElement<String>(_InsertarUsuarioNombre_QNAME, String.class, ActualizarCancha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tipo", scope = ActualizarCancha.class)
    public JAXBElement<String> createActualizarCanchaTipo(String value) {
        return new JAXBElement<String>(_MostrarCanchasTipo_QNAME, String.class, ActualizarCancha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ubicacion", scope = ActualizarCancha.class)
    public JAXBElement<String> createActualizarCanchaUbicacion(String value) {
        return new JAXBElement<String>(_InsertarCanchaUbicacion_QNAME, String.class, ActualizarCancha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ActualizarCanchaResult", scope = ActualizarCanchaResponse.class)
    public JAXBElement<String> createActualizarCanchaResponseActualizarCanchaResult(String value) {
        return new JAXBElement<String>(_ActualizarCanchaResponseActualizarCanchaResult_QNAME, String.class, ActualizarCanchaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correo", scope = MostrarSolicitudes.class)
    public JAXBElement<String> createMostrarSolicitudesCorreo(String value) {
        return new JAXBElement<String>(_MostrarSolicitudesCorreo_QNAME, String.class, MostrarSolicitudes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReservaPendiente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReservaPendiente }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MostrarSolicitudesResult", scope = MostrarSolicitudesResponse.class)
    public JAXBElement<ArrayOfReservaPendiente> createMostrarSolicitudesResponseMostrarSolicitudesResult(ArrayOfReservaPendiente value) {
        return new JAXBElement<ArrayOfReservaPendiente>(_MostrarSolicitudesResponseMostrarSolicitudesResult_QNAME, ArrayOfReservaPendiente.class, MostrarSolicitudesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = InsertarSolicitud.class)
    public JAXBElement<String> createInsertarSolicitudNombre(String value) {
        return new JAXBElement<String>(_InsertarUsuarioNombre_QNAME, String.class, InsertarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apellido", scope = InsertarSolicitud.class)
    public JAXBElement<String> createInsertarSolicitudApellido(String value) {
        return new JAXBElement<String>(_InsertarUsuarioApellido_QNAME, String.class, InsertarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correo", scope = InsertarSolicitud.class)
    public JAXBElement<String> createInsertarSolicitudCorreo(String value) {
        return new JAXBElement<String>(_MostrarSolicitudesCorreo_QNAME, String.class, InsertarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cancha", scope = InsertarSolicitud.class)
    public JAXBElement<String> createInsertarSolicitudCancha(String value) {
        return new JAXBElement<String>(_InsertarSolicitudCancha_QNAME, String.class, InsertarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fechaSolicitadaStr", scope = InsertarSolicitud.class)
    public JAXBElement<String> createInsertarSolicitudFechaSolicitadaStr(String value) {
        return new JAXBElement<String>(_InsertarSolicitudFechaSolicitadaStr_QNAME, String.class, InsertarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "horaSolicitadaStr", scope = InsertarSolicitud.class)
    public JAXBElement<String> createInsertarSolicitudHoraSolicitadaStr(String value) {
        return new JAXBElement<String>(_InsertarSolicitudHoraSolicitadaStr_QNAME, String.class, InsertarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "horaFinalizacionStr", scope = InsertarSolicitud.class)
    public JAXBElement<String> createInsertarSolicitudHoraFinalizacionStr(String value) {
        return new JAXBElement<String>(_InsertarSolicitudHoraFinalizacionStr_QNAME, String.class, InsertarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "motivo", scope = InsertarSolicitud.class)
    public JAXBElement<String> createInsertarSolicitudMotivo(String value) {
        return new JAXBElement<String>(_InsertarSolicitudMotivo_QNAME, String.class, InsertarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "estado", scope = InsertarSolicitud.class)
    public JAXBElement<String> createInsertarSolicitudEstado(String value) {
        return new JAXBElement<String>(_InsertarSolicitudEstado_QNAME, String.class, InsertarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InsertarSolicitudResult", scope = InsertarSolicitudResponse.class)
    public JAXBElement<String> createInsertarSolicitudResponseInsertarSolicitudResult(String value) {
        return new JAXBElement<String>(_InsertarSolicitudResponseInsertarSolicitudResult_QNAME, String.class, InsertarSolicitudResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = ActualizarSolicitud.class)
    public JAXBElement<String> createActualizarSolicitudNombre(String value) {
        return new JAXBElement<String>(_InsertarUsuarioNombre_QNAME, String.class, ActualizarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apellido", scope = ActualizarSolicitud.class)
    public JAXBElement<String> createActualizarSolicitudApellido(String value) {
        return new JAXBElement<String>(_InsertarUsuarioApellido_QNAME, String.class, ActualizarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correo", scope = ActualizarSolicitud.class)
    public JAXBElement<String> createActualizarSolicitudCorreo(String value) {
        return new JAXBElement<String>(_MostrarSolicitudesCorreo_QNAME, String.class, ActualizarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cancha", scope = ActualizarSolicitud.class)
    public JAXBElement<String> createActualizarSolicitudCancha(String value) {
        return new JAXBElement<String>(_InsertarSolicitudCancha_QNAME, String.class, ActualizarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fechaSolicitadaStr", scope = ActualizarSolicitud.class)
    public JAXBElement<String> createActualizarSolicitudFechaSolicitadaStr(String value) {
        return new JAXBElement<String>(_InsertarSolicitudFechaSolicitadaStr_QNAME, String.class, ActualizarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "horaSolicitadaStr", scope = ActualizarSolicitud.class)
    public JAXBElement<String> createActualizarSolicitudHoraSolicitadaStr(String value) {
        return new JAXBElement<String>(_InsertarSolicitudHoraSolicitadaStr_QNAME, String.class, ActualizarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "horaFinalizacionStr", scope = ActualizarSolicitud.class)
    public JAXBElement<String> createActualizarSolicitudHoraFinalizacionStr(String value) {
        return new JAXBElement<String>(_InsertarSolicitudHoraFinalizacionStr_QNAME, String.class, ActualizarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "motivo", scope = ActualizarSolicitud.class)
    public JAXBElement<String> createActualizarSolicitudMotivo(String value) {
        return new JAXBElement<String>(_InsertarSolicitudMotivo_QNAME, String.class, ActualizarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "estado", scope = ActualizarSolicitud.class)
    public JAXBElement<String> createActualizarSolicitudEstado(String value) {
        return new JAXBElement<String>(_InsertarSolicitudEstado_QNAME, String.class, ActualizarSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ActualizarSolicitudResult", scope = ActualizarSolicitudResponse.class)
    public JAXBElement<String> createActualizarSolicitudResponseActualizarSolicitudResult(String value) {
        return new JAXBElement<String>(_ActualizarSolicitudResponseActualizarSolicitudResult_QNAME, String.class, ActualizarSolicitudResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EliminarSolicitudResult", scope = EliminarSolicitudResponse.class)
    public JAXBElement<String> createEliminarSolicitudResponseEliminarSolicitudResult(String value) {
        return new JAXBElement<String>(_EliminarSolicitudResponseEliminarSolicitudResult_QNAME, String.class, EliminarSolicitudResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cancha", scope = InsertarHorario.class)
    public JAXBElement<String> createInsertarHorarioCancha(String value) {
        return new JAXBElement<String>(_InsertarSolicitudCancha_QNAME, String.class, InsertarHorario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fechaStr", scope = InsertarHorario.class)
    public JAXBElement<String> createInsertarHorarioFechaStr(String value) {
        return new JAXBElement<String>(_InsertarHorarioFechaStr_QNAME, String.class, InsertarHorario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "horaInicialStr", scope = InsertarHorario.class)
    public JAXBElement<String> createInsertarHorarioHoraInicialStr(String value) {
        return new JAXBElement<String>(_InsertarHorarioHoraInicialStr_QNAME, String.class, InsertarHorario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "horaFinalStr", scope = InsertarHorario.class)
    public JAXBElement<String> createInsertarHorarioHoraFinalStr(String value) {
        return new JAXBElement<String>(_InsertarHorarioHoraFinalStr_QNAME, String.class, InsertarHorario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InsertarHorarioResult", scope = InsertarHorarioResponse.class)
    public JAXBElement<String> createInsertarHorarioResponseInsertarHorarioResult(String value) {
        return new JAXBElement<String>(_InsertarHorarioResponseInsertarHorarioResult_QNAME, String.class, InsertarHorarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dia", scope = MostrarHorarios.class)
    public JAXBElement<String> createMostrarHorariosDia(String value) {
        return new JAXBElement<String>(_MostrarHorariosDia_QNAME, String.class, MostrarHorarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cancha", scope = MostrarHorarios.class)
    public JAXBElement<String> createMostrarHorariosCancha(String value) {
        return new JAXBElement<String>(_InsertarSolicitudCancha_QNAME, String.class, MostrarHorarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "horaInicial", scope = MostrarHorarios.class)
    public JAXBElement<String> createMostrarHorariosHoraInicial(String value) {
        return new JAXBElement<String>(_MostrarHorariosHoraInicial_QNAME, String.class, MostrarHorarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "horaFinal", scope = MostrarHorarios.class)
    public JAXBElement<String> createMostrarHorariosHoraFinal(String value) {
        return new JAXBElement<String>(_MostrarHorariosHoraFinal_QNAME, String.class, MostrarHorarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHorario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfHorario }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MostrarHorariosResult", scope = MostrarHorariosResponse.class)
    public JAXBElement<ArrayOfHorario> createMostrarHorariosResponseMostrarHorariosResult(ArrayOfHorario value) {
        return new JAXBElement<ArrayOfHorario>(_MostrarHorariosResponseMostrarHorariosResult_QNAME, ArrayOfHorario.class, MostrarHorariosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cancha", scope = ActualizarHorario.class)
    public JAXBElement<String> createActualizarHorarioCancha(String value) {
        return new JAXBElement<String>(_InsertarSolicitudCancha_QNAME, String.class, ActualizarHorario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "diaStr", scope = ActualizarHorario.class)
    public JAXBElement<String> createActualizarHorarioDiaStr(String value) {
        return new JAXBElement<String>(_ActualizarHorarioDiaStr_QNAME, String.class, ActualizarHorario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "horaInicialStr", scope = ActualizarHorario.class)
    public JAXBElement<String> createActualizarHorarioHoraInicialStr(String value) {
        return new JAXBElement<String>(_InsertarHorarioHoraInicialStr_QNAME, String.class, ActualizarHorario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "horaFinalStr", scope = ActualizarHorario.class)
    public JAXBElement<String> createActualizarHorarioHoraFinalStr(String value) {
        return new JAXBElement<String>(_InsertarHorarioHoraFinalStr_QNAME, String.class, ActualizarHorario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ActualizarHorarioResult", scope = ActualizarHorarioResponse.class)
    public JAXBElement<String> createActualizarHorarioResponseActualizarHorarioResult(String value) {
        return new JAXBElement<String>(_ActualizarHorarioResponseActualizarHorarioResult_QNAME, String.class, ActualizarHorarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EliminarHorarioResult", scope = EliminarHorarioResponse.class)
    public JAXBElement<String> createEliminarHorarioResponseEliminarHorarioResult(String value) {
        return new JAXBElement<String>(_EliminarHorarioResponseEliminarHorarioResult_QNAME, String.class, EliminarHorarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "estadoReserva", scope = MostrarHistorialReservas.class)
    public JAXBElement<String> createMostrarHistorialReservasEstadoReserva(String value) {
        return new JAXBElement<String>(_MostrarHistorialReservasEstadoReserva_QNAME, String.class, MostrarHistorialReservas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistorialReserva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfHistorialReserva }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MostrarHistorialReservasResult", scope = MostrarHistorialReservasResponse.class)
    public JAXBElement<ArrayOfHistorialReserva> createMostrarHistorialReservasResponseMostrarHistorialReservasResult(ArrayOfHistorialReserva value) {
        return new JAXBElement<ArrayOfHistorialReserva>(_MostrarHistorialReservasResponseMostrarHistorialReservasResult_QNAME, ArrayOfHistorialReserva.class, MostrarHistorialReservasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReserva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReserva }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MostrarReservasResult", scope = MostrarReservasResponse.class)
    public JAXBElement<ArrayOfReserva> createMostrarReservasResponseMostrarReservasResult(ArrayOfReserva value) {
        return new JAXBElement<ArrayOfReserva>(_MostrarReservasResponseMostrarReservasResult_QNAME, ArrayOfReserva.class, MostrarReservasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = InsertarTipo.class)
    public JAXBElement<String> createInsertarTipoNombre(String value) {
        return new JAXBElement<String>(_InsertarUsuarioNombre_QNAME, String.class, InsertarTipo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InsertarTipoResult", scope = InsertarTipoResponse.class)
    public JAXBElement<String> createInsertarTipoResponseInsertarTipoResult(String value) {
        return new JAXBElement<String>(_InsertarTipoResponseInsertarTipoResult_QNAME, String.class, InsertarTipoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EliminarTipoResult", scope = EliminarTipoResponse.class)
    public JAXBElement<String> createEliminarTipoResponseEliminarTipoResult(String value) {
        return new JAXBElement<String>(_EliminarTipoResponseEliminarTipoResult_QNAME, String.class, EliminarTipoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = ActualizarTipo.class)
    public JAXBElement<String> createActualizarTipoNombre(String value) {
        return new JAXBElement<String>(_InsertarUsuarioNombre_QNAME, String.class, ActualizarTipo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ActualizarTipoResult", scope = ActualizarTipoResponse.class)
    public JAXBElement<String> createActualizarTipoResponseActualizarTipoResult(String value) {
        return new JAXBElement<String>(_ActualizarTipoResponseActualizarTipoResult_QNAME, String.class, ActualizarTipoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MostrarTiposResult", scope = MostrarTiposResponse.class)
    public JAXBElement<ArrayOfTipo> createMostrarTiposResponseMostrarTiposResult(ArrayOfTipo value) {
        return new JAXBElement<ArrayOfTipo>(_MostrarTiposResponseMostrarTiposResult_QNAME, ArrayOfTipo.class, MostrarTiposResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = ActualizarContrasena.class)
    public JAXBElement<String> createActualizarContrasenaLogin(String value) {
        return new JAXBElement<String>(_ValidarUsuarioLogin_QNAME, String.class, ActualizarContrasena.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "email", scope = ActualizarContrasena.class)
    public JAXBElement<String> createActualizarContrasenaEmail(String value) {
        return new JAXBElement<String>(_InsertarUsuarioEmail_QNAME, String.class, ActualizarContrasena.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "newPassword", scope = ActualizarContrasena.class)
    public JAXBElement<String> createActualizarContrasenaNewPassword(String value) {
        return new JAXBElement<String>(_ActualizarContrasenaNewPassword_QNAME, String.class, ActualizarContrasena.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ActualizarContrasenaResult", scope = ActualizarContrasenaResponse.class)
    public JAXBElement<String> createActualizarContrasenaResponseActualizarContrasenaResult(String value) {
        return new JAXBElement<String>(_ActualizarContrasenaResponseActualizarContrasenaResult_QNAME, String.class, ActualizarContrasenaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Nombre", scope = Tipo.class)
    public JAXBElement<String> createTipoNombre(String value) {
        return new JAXBElement<String>(_TipoNombre_QNAME, String.class, Tipo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Apellido", scope = Reserva.class)
    public JAXBElement<String> createReservaApellido(String value) {
        return new JAXBElement<String>(_ReservaApellido_QNAME, String.class, Reserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Cancha", scope = Reserva.class)
    public JAXBElement<String> createReservaCancha(String value) {
        return new JAXBElement<String>(_Cancha_QNAME, String.class, Reserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Correo", scope = Reserva.class)
    public JAXBElement<String> createReservaCorreo(String value) {
        return new JAXBElement<String>(_ReservaCorreo_QNAME, String.class, Reserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Hora", scope = Reserva.class)
    public JAXBElement<Duration> createReservaHora(Duration value) {
        return new JAXBElement<Duration>(_ReservaHora_QNAME, Duration.class, Reserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Nombre", scope = Reserva.class)
    public JAXBElement<String> createReservaNombre(String value) {
        return new JAXBElement<String>(_TipoNombre_QNAME, String.class, Reserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Apellido", scope = HistorialReserva.class)
    public JAXBElement<String> createHistorialReservaApellido(String value) {
        return new JAXBElement<String>(_ReservaApellido_QNAME, String.class, HistorialReserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Cancha", scope = HistorialReserva.class)
    public JAXBElement<String> createHistorialReservaCancha(String value) {
        return new JAXBElement<String>(_Cancha_QNAME, String.class, HistorialReserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Correo", scope = HistorialReserva.class)
    public JAXBElement<String> createHistorialReservaCorreo(String value) {
        return new JAXBElement<String>(_ReservaCorreo_QNAME, String.class, HistorialReserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "EstadoReserva", scope = HistorialReserva.class)
    public JAXBElement<String> createHistorialReservaEstadoReserva(String value) {
        return new JAXBElement<String>(_HistorialReservaEstadoReserva_QNAME, String.class, HistorialReserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Hora", scope = HistorialReserva.class)
    public JAXBElement<Duration> createHistorialReservaHora(Duration value) {
        return new JAXBElement<Duration>(_ReservaHora_QNAME, Duration.class, HistorialReserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Nombre", scope = HistorialReserva.class)
    public JAXBElement<String> createHistorialReservaNombre(String value) {
        return new JAXBElement<String>(_TipoNombre_QNAME, String.class, HistorialReserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Cancha", scope = Horario.class)
    public JAXBElement<String> createHorarioCancha(String value) {
        return new JAXBElement<String>(_Cancha_QNAME, String.class, Horario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "HoraFinal", scope = Horario.class)
    public JAXBElement<Duration> createHorarioHoraFinal(Duration value) {
        return new JAXBElement<Duration>(_HorarioHoraFinal_QNAME, Duration.class, Horario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "HoraInicial", scope = Horario.class)
    public JAXBElement<Duration> createHorarioHoraInicial(Duration value) {
        return new JAXBElement<Duration>(_HorarioHoraInicial_QNAME, Duration.class, Horario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Apellido", scope = ReservaPendiente.class)
    public JAXBElement<String> createReservaPendienteApellido(String value) {
        return new JAXBElement<String>(_ReservaApellido_QNAME, String.class, ReservaPendiente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Cancha", scope = ReservaPendiente.class)
    public JAXBElement<String> createReservaPendienteCancha(String value) {
        return new JAXBElement<String>(_Cancha_QNAME, String.class, ReservaPendiente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Correo", scope = ReservaPendiente.class)
    public JAXBElement<String> createReservaPendienteCorreo(String value) {
        return new JAXBElement<String>(_ReservaCorreo_QNAME, String.class, ReservaPendiente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Estado", scope = ReservaPendiente.class)
    public JAXBElement<String> createReservaPendienteEstado(String value) {
        return new JAXBElement<String>(_ReservaPendienteEstado_QNAME, String.class, ReservaPendiente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Motivo", scope = ReservaPendiente.class)
    public JAXBElement<String> createReservaPendienteMotivo(String value) {
        return new JAXBElement<String>(_ReservaPendienteMotivo_QNAME, String.class, ReservaPendiente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Nombre", scope = ReservaPendiente.class)
    public JAXBElement<String> createReservaPendienteNombre(String value) {
        return new JAXBElement<String>(_TipoNombre_QNAME, String.class, ReservaPendiente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Direccion", scope = Cancha.class)
    public JAXBElement<String> createCanchaDireccion(String value) {
        return new JAXBElement<String>(_CanchaDireccion_QNAME, String.class, Cancha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Nombre", scope = Cancha.class)
    public JAXBElement<String> createCanchaNombre(String value) {
        return new JAXBElement<String>(_TipoNombre_QNAME, String.class, Cancha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Tipo", scope = Cancha.class)
    public JAXBElement<String> createCanchaTipo(String value) {
        return new JAXBElement<String>(_Tipo_QNAME, String.class, Cancha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Apellido", scope = Usuario.class)
    public JAXBElement<String> createUsuarioApellido(String value) {
        return new JAXBElement<String>(_ReservaApellido_QNAME, String.class, Usuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Email", scope = Usuario.class)
    public JAXBElement<String> createUsuarioEmail(String value) {
        return new JAXBElement<String>(_UsuarioEmail_QNAME, String.class, Usuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Login", scope = Usuario.class)
    public JAXBElement<String> createUsuarioLogin(String value) {
        return new JAXBElement<String>(_UsuarioLogin_QNAME, String.class, Usuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Nombre", scope = Usuario.class)
    public JAXBElement<String> createUsuarioNombre(String value) {
        return new JAXBElement<String>(_TipoNombre_QNAME, String.class, Usuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Password", scope = Usuario.class)
    public JAXBElement<String> createUsuarioPassword(String value) {
        return new JAXBElement<String>(_UsuarioPassword_QNAME, String.class, Usuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Telefono", scope = Usuario.class)
    public JAXBElement<String> createUsuarioTelefono(String value) {
        return new JAXBElement<String>(_UsuarioTelefono_QNAME, String.class, Usuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Apellido", scope = Sesion.class)
    public JAXBElement<String> createSesionApellido(String value) {
        return new JAXBElement<String>(_ReservaApellido_QNAME, String.class, Sesion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Email", scope = Sesion.class)
    public JAXBElement<String> createSesionEmail(String value) {
        return new JAXBElement<String>(_UsuarioEmail_QNAME, String.class, Sesion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Login", scope = Sesion.class)
    public JAXBElement<String> createSesionLogin(String value) {
        return new JAXBElement<String>(_UsuarioLogin_QNAME, String.class, Sesion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Nombre", scope = Sesion.class)
    public JAXBElement<String> createSesionNombre(String value) {
        return new JAXBElement<String>(_TipoNombre_QNAME, String.class, Sesion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Password", scope = Sesion.class)
    public JAXBElement<String> createSesionPassword(String value) {
        return new JAXBElement<String>(_UsuarioPassword_QNAME, String.class, Sesion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Telefono", scope = Sesion.class)
    public JAXBElement<String> createSesionTelefono(String value) {
        return new JAXBElement<String>(_UsuarioTelefono_QNAME, String.class, Sesion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "StringValue", scope = CompositeType.class)
    public JAXBElement<String> createCompositeTypeStringValue(String value) {
        return new JAXBElement<String>(_CompositeTypeStringValue_QNAME, String.class, CompositeType.class, value);
    }

}
