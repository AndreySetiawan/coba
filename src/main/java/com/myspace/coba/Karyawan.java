package com.myspace.coba;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Karyawan implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "ID Karyawan")
	private java.lang.Integer idKaryawan;
	@org.kie.api.definition.type.Label(value = "Nama Karyawan")
	private java.lang.String namaKaryawan;

	public Karyawan() {
	}

	public java.lang.Integer getIdKaryawan() {
		return this.idKaryawan;
	}

	public void setIdKaryawan(java.lang.Integer idKaryawan) {
		this.idKaryawan = idKaryawan;
	}

	public java.lang.String getNamaKaryawan() {
		return this.namaKaryawan;
	}

	public void setNamaKaryawan(java.lang.String namaKaryawan) {
		this.namaKaryawan = namaKaryawan;
	}

	public Karyawan(java.lang.Integer idKaryawan, java.lang.String namaKaryawan) {
		this.idKaryawan = idKaryawan;
		this.namaKaryawan = namaKaryawan;
	}

}