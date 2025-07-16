package com.perpustkaan.perpus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

@Entity
public class Buku {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String judul;
  private String penulis;
  private int tahunTerbit;

  // Constructors
  public Buku() {
  }

  public Buku(String judul, String penulis, int tahunTerbit) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
  }

  public Long getId() {
    return id;
  }

  public String getJudul() {
    return judul;
  }

  public String getPenulis() {
    return penulis;
  }

  public int getTahunTerbit() {
    return tahunTerbit;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setJudul(String judul) {
    this.judul = judul;
  }

  public void setPenulis(String penulis) {
    this.penulis = penulis;
  }

  public void setTahunTerbit(int tahunTerbit) {
    this.tahunTerbit = tahunTerbit;
  }

}
