package exc11Cinema;

class CinemaApp {
    public static void main(String[] args) {

        int ticketCount;

        Movie movie1 = new Movie("Omen", "horror", 128, 16, 72, 72);
        Client client1 = new Client("Jan", "Kowalski", 14);
        Client client2 = new Client("Anna", "Zalewska", 25);
        TicketService ticketService = new TicketService();
        Ticket ticket1 = ticketService.buyTicket(client1, movie1);
        Ticket ticket2 = ticketService.buyTicket(client2, movie1);


        System.out.println("Sprzedane bilety");
        if (ticket1 != null) {
            ticketService.printTicketInfo(ticket1);
        }
        if (ticket2 != null) {
            ticketService.printTicketInfo(ticket2);
        }

}
}