package uk.gov.nationalarchives.pronom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import uk.gov.nationalarchives.pronom.signaturefile.XmlFragment;

/**
 * This class was generated by Apache CXF 2.2.5
 * Wed Dec 09 09:40:08 GMT 2009
 * Generated source version: 2.2.5
 * 
 */
 
@WebService(targetNamespace = "http://pronom.nationalarchives.gov.uk", name = "PronomService")
@XmlSeeAlso({uk.gov.nationalarchives.pronom.signaturefile.ObjectFactory.class,ObjectFactory.class})
public interface PronomService {

    @WebResult(name = "SignatureFile", targetNamespace = "http://pronom.nationalarchives.gov.uk")
    @RequestWrapper(localName = "getSignatureFileV1", targetNamespace = "http://pronom.nationalarchives.gov.uk", className = "uk.gov.nationalarchives.pronom.GetSignatureFileV1")
    @ResponseWrapper(localName = "getSignatureFileV1Response", targetNamespace = "http://pronom.nationalarchives.gov.uk", className = "uk.gov.nationalarchives.pronom.GetSignatureFileV1Response")
    @WebMethod(action = "http://pronom.nationalarchives.gov.uk:getSignatureFileV1In")
    public XmlFragment getSignatureFileV1();

    @RequestWrapper(localName = "getSignatureFileVersionV1", targetNamespace = "http://pronom.nationalarchives.gov.uk", className = "uk.gov.nationalarchives.pronom.GetSignatureFileVersionV1")
    @ResponseWrapper(localName = "getSignatureFileVersionV1Response", targetNamespace = "http://pronom.nationalarchives.gov.uk", className = "uk.gov.nationalarchives.pronom.GetSignatureFileVersionV1Response")
    @WebMethod(action = "http://pronom.nationalarchives.gov.uk:getSignatureFileVersionV1In")
    public void getSignatureFileVersionV1(
        @WebParam(mode = WebParam.Mode.OUT, name = "Version", targetNamespace = "http://pronom.nationalarchives.gov.uk")
        javax.xml.ws.Holder<Version> version,
        @WebParam(mode = WebParam.Mode.OUT, name = "Deprecated", targetNamespace = "http://pronom.nationalarchives.gov.uk")
        javax.xml.ws.Holder<java.lang.Boolean> deprecated
    );
}
