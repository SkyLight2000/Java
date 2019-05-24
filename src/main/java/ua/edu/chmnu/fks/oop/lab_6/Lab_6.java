package ua.edu.chmnu.fks.oop.lab_6;

public class Lab_6 {

    static public void main(String[] args) throws NegativePriceException, NegativeYearException, FutureYearException, EnormousPriceException, EnormousPageNumberException, NegativePageNumberException {
        Manual manual = new Manual(
                "Нормальная физиология",
                "Агаджанян Николай Александрович",
                2001,
                233,
                500
        );
        Textbook textbook = new Textbook(
                "Всеобщая история. История Нового времени.",
                "Бурин Сергей Николаевич , Ведюшкин Владимир Александрович",
                2013,
                165,
                350
        );
        Encyclopedia encyclopedia = new Encyclopedia(
                "Все о лечебных и магических минералах",
                "Стоун Джаспер",
                2005,
                321,
                645
        );
        System.out.printf(manual.toString());
        System.out.printf(textbook.toString());
        System.out.printf(encyclopedia.toString());
    }

    static abstract class Book{
        private String name;
        private String author;
        private int year;
        private int pageNumber;
        private int price;

        public Book(String name, String author, int year, int pageNumber, int price) throws NegativeYearException, FutureYearException, NegativePageNumberException, EnormousPageNumberException, EnormousPriceException, NegativePriceException {
            this.name = name;
            this.author = author;
            if(year > 0 && year < 2019) {
                this.year = year;
            }
            else if(year < 0) {
                throw new NegativeYearException("Year can't be less than 0");
            }
            else{
                throw new FutureYearException("Are you from future?");
            }
            if(pageNumber > 0 && pageNumber < 23675) {
                this.pageNumber = pageNumber;
            }
            else if(pageNumber < 0) {
                throw new NegativePageNumberException("Page number can't be less than 0");
            }
            else{
                throw new EnormousPageNumberException("It can't be bigger then book of the fund min a-kasse, the biggest book in the world(It has 23675 pages!)");
            }
            if(price > 0 && price < 300800000) {
                this.price = price;
            }
            else if(price < 0) {
                throw new NegativePriceException("Price can't be less than 0");
            }
            else {
                throw new EnormousPriceException("It can't be more expensive than Leicester Code, the most expensive book in the world");
            }
        }

        public abstract String getBookType();

        public String getName(){
            return name;
        }

        public String getAuthor(){
            return author;
        }

        public int getYear(){
            return year;
        }

        public int getPageNumber(){
            return pageNumber;
        }

        public int getPrice(){
            return  price;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAuthor(String author){
            this.author = author;
        }

        public void setYear(int year) throws NegativeYearException, FutureYearException {
            if(year > 0 && year < 2019) {
                this.year = year;
            }
            else if(year < 0) {
                throw new NegativeYearException("Year can't be less than 0");
            }
            else{
                throw new FutureYearException("Are you from future?");
            }
        }

        public void setPageNumber(int pageNumber) throws NegativePageNumberException, EnormousPageNumberException {
            if(pageNumber > 0 && pageNumber < 23675) {
                this.pageNumber = pageNumber;
            }
            else if(pageNumber < 0) {
                throw new NegativePageNumberException("Page number can't be less than 0");
            }
            else{
                throw new EnormousPageNumberException("It can't be bigger then book of the fund min a-kasse, the biggest book in the world(It has 23675 pages!)");
            }
        }

        public void setPrice(int price) throws NegativePriceException, EnormousPriceException {
            if(price > 0 && price < 300800000) {
                this.price = price;
            }
            else if(price < 0) {
                throw new NegativePriceException("Price can't be less than 0");
            }
            else {
                throw new EnormousPriceException("It can't be more expensive than Leicester Code, the most expensive book in the world");
            }
        }
    }

    static class Textbook extends Book{
        private String bookType = "Учебник";

        public Textbook(String name, String author, int year, int pageNumber, int price) throws NegativePriceException, NegativeYearException, FutureYearException, EnormousPriceException, EnormousPageNumberException, NegativePageNumberException {
            super(name, author, year, pageNumber, price);
        }

        @Override
        public String getBookType() {
            return bookType;
        }

        @Override
        public String toString() {
            return '\n' + "Тип книги: " + bookType + '\n' +
                    "Имя: " + getName() + '\n' +
                    "Автор: " + getAuthor() + '\n' +
                    "Год: " + getYear() + '\n' +
                    "Кол-во страниц: " + getPageNumber() + '\n' +
                    "Цена: " + getPrice() + '\n';
        }
    }

    static class Manual extends Book{
        private String bookType = "Пособие";

        public Manual(String name, String author, int year, int pageNumber, int price) throws NegativePriceException, NegativeYearException, FutureYearException, EnormousPriceException, EnormousPageNumberException, NegativePageNumberException {
            super(name, author, year, pageNumber, price);
        }

        @Override
        public String getBookType() {
            return bookType;
        }

        @Override
        public String toString() {
            return '\n' + "Тип книги: " + bookType + '\n' +
                    "Имя: " + getName() + '\n' +
                    "Автор: " + getAuthor() + '\n' +
                    "Год: " + getYear() + '\n' +
                    "Кол-во страниц: " + getPageNumber() + '\n' +
                    "Цена: " + getPrice() + '\n';
        }
    }

    static class Encyclopedia extends Book{
        private String bookType = "Энциклопедия";

        public Encyclopedia(String name, String author, int year, int pageNumber, int price) throws NegativePriceException, NegativeYearException, FutureYearException, EnormousPriceException, EnormousPageNumberException, NegativePageNumberException {
            super(name, author, year, pageNumber, price);
        }

        @Override
        public String getBookType() {
            return bookType;
        }

        @Override
        public String toString() {
            return '\n' + "Тип книги: " + bookType + '\n' +
                    "Имя: " + getName() + '\n' +
                    "Автор: " + getAuthor() + '\n' +
                    "Год: " + getYear() + '\n' +
                    "Кол-во страниц: " + getPageNumber() + '\n' +
                    "Цена: " + getPrice() + '\n';
        }
    }
}
