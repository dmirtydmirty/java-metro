import java.awt.*;
public class InitMs {
    public static MetroSystem initSimpleMs(){
        // Создание системы метро
        MetroSystem metroSystem = new MetroSystem(13, 11);

        // Создание линий
        Line lineB = new Line("Blue", Color.BLUE);
        Line lineG = new Line("Green", Color.GREEN);
        Line lineR = new Line("Red", Color.RED);

        // Создание станций
        Station stationA = new Station("A", 1, 3);
        Station stationB = new Station("B", 4, 3);
        Station stationC = new Station("C", 7, 3);
        Station stationD = new Station("D", 10, 3);

        Station stationE = new Station("E", 3, 2);
        Station stationF = new Station("F", 5, 5);
        Station stationG = new Station("G", 6, 7);
        Station stationH = new Station("H", 8, 10);

        Station stationI = new Station("I", 7, 8);
        Station stationJ = new Station("J", 9, 6);
        Station stationK = new Station("K", 11, 5);
        Station stationL = new Station("L", 11, 2);

        // Добавленеи станции на ветки
        lineB.addStation(stationA);
        lineB.addStation(stationB);
        lineB.addStation(stationC);
        lineB.addStation(stationD);

        lineG.addStation(stationE);
        lineG.addStation(stationF);
        lineG.addStation(stationG);
        lineG.addStation(stationH);

        lineR.addStation(stationI);
        lineR.addStation(stationJ);
        lineR.addStation(stationK);
        lineR.addStation(stationL);

        // Добавление пересечений линий
        Cross c1 = new  Cross(lineB, stationB, lineG, stationF);
        Cross c2 = new  Cross(lineG, stationH, lineR, stationI);
        Cross c3 = new  Cross(lineB, stationD, lineR, stationL);

        metroSystem.addCross(c1);
        metroSystem.addCross(c2);
        metroSystem.addCross(c3);

        // Создание линий метро
        metroSystem.addLine(lineR);
        metroSystem.addLine(lineG);
        metroSystem.addLine(lineB);

        return metroSystem;
    }

    public static MetroSystem initSpbMetro(){
        MetroSystem metroSystem = new MetroSystem(33, 33);

        Line lineR = new Line("Red", Color.RED);
        Line lineB = new Line("Blue", Color.BLUE);
        Line lineG = new Line("Green", Color.GREEN);
        Line lineP = new Line("Red", Color.MAGENTA);
        Line lineO = new Line("Red", Color.ORANGE);


        Station stationVet = new Station("Проспект Ветеранов", 7, 2);
        Station stationLen = new Station("Ленинский проспект", 7, 4);
        Station stationAvt = new Station("Автово", 7, 6);
        Station stationKir = new Station("Кировсекий завод", 7, 7);
        Station stationNar = new Station("Нарвская", 7, 9);
        Station stationBalt = new Station("Балтийская", 7, 10);
        Station stationTI1 = new Station("Т. И. 1", 12, 12);
        Station stationPush = new Station("Пушкинская", 17, 12);
        Station stationVlad = new Station("Влидимирская", 17, 16);
        Station stationPV = new Station("Площадь восстания", 18, 18);
        Station stationChern = new Station("Чернышевская", 19, 22);
        Station stationPL = new Station("Площадь ленина", 19, 23);
        Station stationVib = new Station("Выборгская", 19, 24);
        Station stationLes = new Station("Лесная", 19, 26);
        Station stationMuzh = new Station("Площадь мужества", 19, 27);
        Station stationPltch = new Station("Политехническая", 19, 28);
        Station stationAkad = new Station("Aкадемическая", 19, 29);
        Station stationGrazh = new Station("Гражданский проспект", 19, 30);
        Station stationDev = new Station("Девяткино", 19, 31);

        Station stationKup = new Station("Купчино", 12, 1);
        Station stationZv = new Station("Звездная", 12, 2);
        Station stationMos = new Station("Московская", 12, 4);
        Station stationPP = new Station("Парк Победы", 12, 6);
        Station stationElec = new Station("Электросила", 12, 7);
        Station stationMV = new Station("Фрунзенская", 12, 10);
        Station stationFR = new Station("Московские ворота", 12, 9);
        Station stationTI2 = new Station("Т. И. 2", 13, 12);
        Station stationSen = new Station("Сенная", 12, 15);
        Station stationNP = new Station("Невский проспект", 12, 18);
        Station stationGor = new Station("Горьковская", 12, 22);
        Station stationPetr = new Station("Петроградская", 12, 23);
        Station stationChR = new Station("Черная речка", 12, 24);
        Station stationPion = new Station("Пионерская", 12, 26);
        Station stationUd = new Station("Удельная", 12, 27);
        Station stationOz = new Station("Озерки", 12, 28);
        Station stationPrPr = new Station("Проспект просвещения", 12, 29);
        Station stationPar = new Station("Парная", 12, 31);

        Station stationRib = new Station("Рыбацкое", 23, 4);
        Station stationOb = new Station("Обухово", 23, 6);
        Station stationPr = new Station("Пролетрарская", 23, 7);
        Station stationLom = new Station("Ломоносоввская", 23, 9);
        Station stationEliz = new Station("Елизаровская", 23, 10);
        Station stationPAN1 = new Station("Площадь А. Невского 1", 22, 16);
        Station stationMayak = new Station("Маяковская", 19, 18);
        Station stationGost = new Station("Гостиный двор", 13, 18);
        Station stationVas = new Station("Василеостровская", 4, 18);
        Station stationPrim = new Station("Приморская", 2, 20);
        Station stationZen = new Station("Зенит", 2, 22);
        Station stationBeg = new Station("Беговая", 2, 24);

        Station stationVol = new Station("Волковская", 18, 9);
        Station stationZven = new Station("Звенигородская", 18, 12);
        Station stationSad = new Station("Садовая", 12, 16);
        Station stationSport = new Station("Спортивная", 7, 22);
        Station stationChkal = new Station("Чкаловская", 7, 23);
        Station stationKrest = new Station("Крестовский островв", 7, 24);
        Station stationStar = new Station("Старая деревня", 7, 26);
        Station stationKomend = new Station("Комендантский проспект", 7, 28);

        Station stationDib = new Station("Улица дыбенко", 28, 6);
        Station stationBol = new Station("Проспект большивиков", 28, 8);
        Station stationLad = new Station("Ладожская", 28, 10);
        Station stationNov = new Station("Новочеркасская", 28, 12);
        Station stationPAN2 = new Station("Площадь А. Невского 2", 23, 16);
        Station stationLig = new Station("Лиговский проспект", 19, 16);
        Station stationDost = new Station("Достоевская", 18, 16);
        Station stationSpas = new Station("Спасская", 13, 16);

        lineR.addStation(stationVet);
        lineR.addStation(stationLen);
        lineR.addStation(stationAvt);
        lineR.addStation(stationKir);
        lineR.addStation(stationNar);
        lineR.addStation(stationBalt);
        lineR.addStation(stationTI1);
        lineR.addStation(stationPush);
        lineR.addStation(stationVlad);
        lineR.addStation(stationPV);
        lineR.addStation(stationChern);
        lineR.addStation(stationPL);
        lineR.addStation(stationVib);
        lineR.addStation(stationLes);
        lineR.addStation(stationMuzh);
        lineR.addStation(stationPltch);
        lineR.addStation(stationAkad);
        lineR.addStation(stationGrazh);
        lineR.addStation(stationDev);

        lineB.addStation(stationKup);
        lineB.addStation(stationZv);
        lineB.addStation(stationMos);
        lineB.addStation(stationPP);
        lineB.addStation(stationElec);
        lineB.addStation(stationMV);
        lineB.addStation(stationFR);
        lineB.addStation(stationTI2);
        lineB.addStation(stationSen);
        lineB.addStation(stationNP);
        lineB.addStation(stationGor);
        lineB.addStation(stationPetr);
        lineB.addStation(stationChR);
        lineB.addStation(stationPion);
        lineB.addStation(stationUd);
        lineB.addStation(stationOz);
        lineB.addStation(stationPrPr);
        lineB.addStation(stationPar);

        lineG.addStation(stationRib);
        lineG.addStation(stationOb);
        lineG.addStation(stationPr);
        lineG.addStation(stationLom);
        lineG.addStation(stationEliz);
        lineG.addStation(stationPAN1);
        lineG.addStation(stationMayak);
        lineG.addStation(stationGost);
        lineG.addStation(stationVas);
        lineG.addStation(stationPrim);
        lineG.addStation(stationZen);
        lineG.addStation(stationBeg);

        lineP.addStation(stationVol);
        lineP.addStation(stationZven);
        lineP.addStation(stationSad);
        lineP.addStation(stationSport);
        lineP.addStation(stationChkal);
        lineP.addStation(stationKrest);
        lineP.addStation(stationStar);
        lineP.addStation(stationKomend);

        lineO.addStation(stationDib);
        lineO.addStation(stationBol);
        lineO.addStation(stationLad);
        lineO.addStation(stationNov);
        lineO.addStation(stationPAN2);
        lineO.addStation(stationLig);
        lineO.addStation(stationDost);
        lineO.addStation(stationSpas);

        metroSystem.addLine(lineR);
        metroSystem.addLine(lineB);
        metroSystem.addLine(lineG);
        metroSystem.addLine(lineP);
        metroSystem.addLine(lineO);

        metroSystem.addCross(new Cross(lineR, stationTI1, lineB, stationTI2));
        metroSystem.addCross(new Cross(lineR, stationPush, lineP, stationZven));
        metroSystem.addCross(new Cross(lineR, stationPV, lineG, stationMayak));
        metroSystem.addCross(new Cross(lineB, stationNP, lineG, stationGost));
        metroSystem.addCross(new Cross(lineB, stationSen, lineP, stationSad));
        metroSystem.addCross(new Cross(lineP, stationSad, lineO, stationSpas));
        metroSystem.addCross(new Cross(lineO, stationSpas, lineB,stationSen));

        return metroSystem;
    }
}
