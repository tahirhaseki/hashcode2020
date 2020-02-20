/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashCode;

/**
 *
 * @author hsn61
 */
public class Library implements Comparable<Library>{
	public static int counter = 0;
	public int ID;
    public Book books[]; 
    public int book_counter;
    public int sign_time;
    public int scanper_day;
    public int need_day;
    public double total_day;
    public int total_point;
    public double daily_profit;

    public Library(int numb_books, int sign_time, int scanper_day) {
    	this.ID = counter;
    	counter++;
        this.book_counter=0;
        this.books=new Book[numb_books];
        this.sign_time = sign_time;
        this.scanper_day = scanper_day;
        this.need_day = numb_books/scanper_day;
        this.total_day = need_day + sign_time;
        
        //this.daily_profit = total_point/total_day;
        
    }

    public void addBook(Book book)
    {
        books[book_counter]= book;
        total_point += book.point;
        book_counter++;
    }
    
    public void calcuateProfit() {
    	this.daily_profit = total_point/total_day;
    }
    
    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }


    public int getSign_time() {
        return sign_time;
    }

    public void setSign_time(int sign_time) {
        this.sign_time = sign_time;
    }

    public int getScanper_day() {
        return scanper_day;
    }

    public void setScanper_day(int scanper_day) {
        this.scanper_day = scanper_day;
    }

    public int getNeed_day() {
        return need_day;
    }

    public void setNeed_day(int need_day) {
        this.need_day = need_day;
    }

    public double getTotal_day() {
        return total_day;
    }

    public void setTotal_day(int total_day) {
        this.total_day = total_day;
    }

    public int getTotal_point() {
        return total_point;
    }

    public void setTotal_point(int total_point) {
        this.total_point = total_point;
    }

    public double getDaily_profit() {
        return daily_profit;
    }

    public void setDaily_profit(int daily_profit) {
        this.daily_profit = daily_profit;
    }

	@Override
	public int compareTo(Library o) {
	    if(this.daily_profit<o.daily_profit)
	          return 1;
	    else if(o.daily_profit<this.daily_profit)
	          return -1;
	    return 0;
	}
    
    
}
