/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movieticketbookingsystem;

public class Booking {
	
	private int ID;
	private int seats;
	private Movie movie;
	private Show show;
	
	public Booking() {}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public Show getShow() {
		return show;
	}
	
	public void setShow(Show show) {
		this.show = show;
	}
	
	public void print() {
		System.out.print(ID+"\t");
		System.out.print(seats+"\t");
		System.out.print(movie.getName()+"\t");
		System.out.print(show.getDate()+"\t");
		System.out.print(show.getTime()+"\n");
	}

}