//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.11 a las 06:47:43 PM CDT 
//


package org.example.aerolinea;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="avion" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idAvion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="numPasajeros" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="piloto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="aeromosas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "avion"
})
@XmlRootElement(name = "ListarAvionesResponse")
public class ListarAvionesResponse {

    @XmlElement(required = true)
    protected List<ListarAvionesResponse.Avion> avion;

    /**
     * Gets the value of the avion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListarAvionesResponse.Avion }
     * 
     * 
     */
    public List<ListarAvionesResponse.Avion> getAvion() {
        if (avion == null) {
            avion = new ArrayList<ListarAvionesResponse.Avion>();
        }
        return this.avion;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="idAvion" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="numPasajeros" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="piloto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="aeromosas" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idAvion",
        "modelo",
        "numPasajeros",
        "piloto",
        "aeromosas",
        "destino"
    })
    public static class Avion {

        protected int idAvion;
        @XmlElement(required = true)
        protected String modelo;
        protected int numPasajeros;
        @XmlElement(required = true)
        protected String piloto;
        @XmlElement(required = true)
        protected String aeromosas;
        @XmlElement(required = true)
        protected String destino;

        public Avion() {
			// TODO Auto-generated constructor stub
		}
        
        

		public Avion(int idAvion, String modelo, int numPasajeros, String piloto, String aeromosas, String destino) {
			this.idAvion = idAvion;
			this.modelo = modelo;
			this.numPasajeros = numPasajeros;
			this.piloto = piloto;
			this.aeromosas = aeromosas;
			this.destino = destino;
		}



		/**
         * Obtiene el valor de la propiedad idAvion.
         * 
         */
        public int getIdAvion() {
            return idAvion;
        }

        /**
         * Define el valor de la propiedad idAvion.
         * 
         */
        public void setIdAvion(int value) {
            this.idAvion = value;
        }

        /**
         * Obtiene el valor de la propiedad modelo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelo() {
            return modelo;
        }

        /**
         * Define el valor de la propiedad modelo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelo(String value) {
            this.modelo = value;
        }

        /**
         * Obtiene el valor de la propiedad numPasajeros.
         * 
         */
        public int getNumPasajeros() {
            return numPasajeros;
        }

        /**
         * Define el valor de la propiedad numPasajeros.
         * 
         */
        public void setNumPasajeros(int value) {
            this.numPasajeros = value;
        }

        /**
         * Obtiene el valor de la propiedad piloto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPiloto() {
            return piloto;
        }

        /**
         * Define el valor de la propiedad piloto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPiloto(String value) {
            this.piloto = value;
        }

        /**
         * Obtiene el valor de la propiedad aeromosas.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAeromosas() {
            return aeromosas;
        }

        /**
         * Define el valor de la propiedad aeromosas.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAeromosas(String value) {
            this.aeromosas = value;
        }

        /**
         * Obtiene el valor de la propiedad destino.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestino() {
            return destino;
        }

        /**
         * Define el valor de la propiedad destino.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestino(String value) {
            this.destino = value;
        }

    }

}
