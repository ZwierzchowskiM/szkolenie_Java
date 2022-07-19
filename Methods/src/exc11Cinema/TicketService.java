package exc11Cinema;

public class TicketService {


    private int lastTicketID = 1;


    public Ticket buyTicket(Client client, Movie movie) {
        boolean isFree = checkFreeSeats(movie);
        boolean isAgeOk = checkAge(movie, client);

        if (isAgeOk && isFree) {
            String personData = client.getFirstName() + " " + client.getLastName();
            String movieName = movie.getMovieTitle();
            Ticket ticket = new Ticket(lastTicketID, client, movie);
            lastTicketID++;
            movie.setFreeSeats(movie.getFreeSeats() - 1);

            return ticket;
        } else {
            System.out.println("Nie można kupić biletu");
            return null;
        }
    }

    private boolean checkFreeSeats(Movie movie) {

        if (movie.getFreeSeats() > 0) {
            return true;
        } else {
            System.out.println("Brak wolnych miejsc");
            return false;
        }
    }

    private boolean checkAge(Movie movie, Client client) {

        if (client.getAge() > movie.getAgeRequired()) {
            return true;
        } else {
            System.out.println("Zbyt niski wiek");
            return false;
        }
    }

    public void printTicketInfo(Ticket ticket) {
        String persondata = ticket.getClient().getFirstName() + " " + ticket.getClient().getLastName();
        System.out.println(ticket.getTicketId() + " | " + persondata + " | " + ticket.getMovie().getMovieInfo() + "min");

    }
}
