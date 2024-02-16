package Lesson_6.DayInfo;

public class DayInfo {
    String day;

    public DayInfo(String day) {
        this.day = day;
    }

    private void show(String message) {
        System.out.println(message);
    }

    public void getSeason(int kun, int oy, int year) {
        switch (oy) {
            case 1:
            case 12:
                if (1 <= kun && kun <= 31) {
                    show("Qish");
                } else {
                    show("Bunday kun yo`q");
                }
                break;
            case 2:
                if (1 <= kun && kun <= 28) {
                    show("Qish");
                } else {
                    show("Bunday kun yo`q");
                }
                break;
            case 3:
            case 5:
                if (1 <= kun && kun <= 31) {
                    show("Bahor");
                } else {
                    show("Bunday kun yo`q");
                }
                break;
            case 4:
                if (1 <= kun && kun <= 30) {
                    show("Bahor");
                } else {
                    show("Bunday kun yo`q");
                }
                break;
            case 6:
                if (1 <= kun && kun <= 30) {
                    show("Qish");
                } else {
                    show("Bunday kun yo`q");
                }
                break;
            case 7:
            case 8:
                if (1 <= kun && kun <= 31) {
                    show("Yoz");
                } else {
                    show("Bunday kun yo`q");
                }
                break;
            case 9:
            case 11:
                if (1 <= kun && kun <= 30) {
                    show("Kuz");
                } else {
                    show("Bunday kun yo`q");
                }
                break;
            case 10:
                if (1 <= kun && kun <= 31) {
                    show("Kuz");
                } else {
                    show("Bunday kun yo`q");
                }
                break;
            default:
                System.out.println("Bunday oy yo'q");
        }
//        if (0 < kun && kun < 32) {
//            System.out.println(kun);
//            System.out.println(oy);
//        } else if (oy > 12) {
//            System.out.println("Bunday sana yo'q");
//        }
    }

    public String nextDay(int day, int month, int year) {
        switch (month) {
            case 1:
                if (day < 31) {
                    ++day;
                    return "" + day + "/" + month + "/" + year;
                } else if (day == 31) {
                    ++month;
                    day = 1;
                    return "" + day + "/" + month + "/" + year;
                }
                break;
            case 2:
                if (day < 28) {
                    ++day;
                    return "" + day + "/" + month + "/" + year;
                } else if (day == 28) {
                    ++month;
                    day = 1;
                    return "" + day + "/" + month + "/" + year;
                } else {
                    show("Bunday day yo'q");
                }
                break;
            case 3:
                if (day < 31) {
                    ++day;
                    return "" + day + "/" + month + "/" + year;
                } else if (day == 31) {
                    ++month;
                    day = 1;
                    return "" + day + "/" + month + "/" + year;
                }
                break;
            case 4:
                if (day < 30) {
                    ++day;
                    return "" + day + "/" + month + "/" + year;
                } else if (day == 30) {
                    ++month;
                    day = 1;
                    return "" + day + "/" + month + "/" + year;
                }
                break;
            case 5:
                if (day < 31) {
                    ++day;
                    return "" + day + "/" + month + "/" + year;
                } else if (day == 31) {
                    ++month;
                    day = 1;
                    return "" + day + "/" + month + "/" + year;
                }
                break;
            case 6:
                if (day < 30) {
                    ++day;
                    return "" + day + "/" + month + "/" + year;
                } else if (day == 30) {
                    ++month;
                    day = 1;
                    return "" + day + "/" + month + "/" + year;
                }
                break;
            case 7:
                if (day < 31) {
                    ++day;
                    return "" + day + "/" + month + "/" + year;
                } else if (day == 31) {
                    ++month;
                    day = 1;
                    return "" + day + "/" + month + "/" + year;
                }
                break;
            case 8:
                if (day < 31) {
                    ++day;
                    return "" + day + "/" + month + "/" + year;
                } else if (day == 31) {
                    ++month;
                    day = 1;
                    return "" + day + "/" + month + "/" + year;
                }
                break;
            case 9:
                if (day < 30) {
                    ++day;
                    return "" + day + "/" + month + "/" + year;
                } else if (day == 30) {
                    ++month;
                    day = 1;
                    return "" + day + "/" + month + "/" + year;
                }
                break;
            case 10:
                if (day < 31) {
                    ++day;
                    return "" + day + "/" + month + "/" + year;
                } else if (day == 31) {
                    ++month;
                    day = 1;
                    return "" + day + "/" + month + "/" + year;
                }
                break;
            case 11:
                if (day < 30) {
                    ++day;
                    return "" + day + "/" + month + "/" + year;
                } else if (day == 30) {
                    ++month;
                    day = 1;
                    return "" + day + "/" + month + "/" + year;
                }
                break;
            case 12:
                if (day < 31) {
                    ++day;
                    return "" + day + "/" + month + "/" + year;
                } else if (day == 31) {
                    ++year;
                    month = 1;
                    day = 1;
                    return "" + day + "/" + month + "/" + year;
                }
                break;
            default:
                show("Bunday oy yo`q");
        }
        if (0 < day && day < 32) {
            System.out.println(day);
            System.out.println(month);
        } else if (month > 12) {
            show("Bunday sana yo'q");
        }
        return "Bunday kun yo`q";
    }
}
