package ua.edu.chmnu.fks.oop.lab_6;

import ua.edu.chmnu.fks.oop.lab_6.Exceptions.*;

public class Lab_6 {

    static public void main(String[] args) throws PriceException, YearException, PageNumberException {
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

}
