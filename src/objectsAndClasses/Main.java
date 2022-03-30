package objectsAndClasses;



public class Main {
    public static void main(String[] args) {

        Author mikhailBulgakov = new Author("Михаил Булгаков");
        Book masterAndMargarita = new Book("Михаил Булгаков", 504, "АСТ", 1967);


        Author oldosHucksley = new Author("Олдос Хаксли");
        Book braweNewWorld = new Book("Олдос Хаксли", 176, "АСТ", 1958);

        masterAndMargarita.setPublicationYear(1968);
        System.out.println("Автором Романа Мастер и Маргарита является "+ masterAndMargarita.getAuthorName() + ". Публикуется издательством " + masterAndMargarita.getPublisherName() + ". Количество страниц в печатном виде " + masterAndMargarita.getPageAmount()+" Годом публикации, стоит считать " +masterAndMargarita.getPublicationYear());
        braweNewWorld.setPublicationYear(1959);
        System.out.println("Антиутопия О дивный новый мир автором, которой является "+ braweNewWorld.getAuthorName() + " ,была написана в "+ braweNewWorld.getPublicationYear() + ". Издательстовом на данный момент является " + braweNewWorld.getPublisherName() + ". Количество страниц в печатном виде " +braweNewWorld.getPageAmount() );
    }
}


