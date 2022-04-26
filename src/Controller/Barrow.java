package Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import Contributors.People.IMember;
import Log.LogCollector;
import Products.IBook;

public class Barrow {
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    private LocalDateTime now = LocalDateTime.now();  
    private IMember barrower;
    private Date barrowDate;
    private ArrayList<IBook> barrowedBook;

    public void Barrowing(IMember barrower, IBook barrowedBook){
        if(!Checker(barrowedBook)) return;

        this.barrowedBook.add(barrowedBook);
        this.barrower=barrower;
        this.barrowDate= new Date(dtf.format(now));
        barrowedBook.setBarrowLog(barrowedBook.getBarrowLog()+1);

        LogCollector.Logger(String.valueOf(barrower.getId())+" "+String.valueOf(barrowedBook.getId())+"barrowed.");
    }

    public void BackBarrow(IMember barrower, IBook barrowedBook){
        barrowedBook.setBarrowLog(barrowedBook.getBarrowLog()-1);
        if(this.barrowDate.getMonth() < now.getMonthValue()){
            Penalty(barrower, now.getDayOfYear()-barrowDate.getDay());
        }
        LogCollector.Logger(String.valueOf(barrower.getId())+" "+String.valueOf(barrowedBook.getId())+"barrowed back.");
    }

    private void Penalty(IMember member, int day){
        System.out.println(member.getId()+"has to paye"+String.valueOf(day*1500));
        LogCollector.Logger(member.getId()+"has to paye"+String.valueOf(day*1500));
    }

    public void ReBarrow(){
        this.barrowDate= new Date(dtf.format(now));
    }

    private boolean Checker(IBook book){
        if(book.getNumberOfCopies()>book.getBarrowLog()){
            return true;
        }
        return false;
    }
}
