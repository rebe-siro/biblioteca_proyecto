package org.biblioteca.controller;

public class Library { 
  private Usuario modelo; 
  private UsuarioView vista; 
  
public UsuarioController(Usuario modelo, UsuarioView vista) {
  this.modelo = modelo; 
  this.vista = vista;
