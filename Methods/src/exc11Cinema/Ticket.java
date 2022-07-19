package exc11Cinema;

public class Ticket {

    private int ticketId;
    private String ticketPersonData;
    private String ticketMovieTitle;
    private Movie movie;
    private Client client;

    public Ticket(int ticket1Id, Client client, Movie movie) {
        this.ticketId = ticket1Id;
        this.movie = movie;
        this.client = client;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketPersonData() {
        return ticketPersonData;
    }

    public void setTicketPersonData(String ticketPersonData) {
        this.ticketPersonData = ticketPersonData;
    }

    public String getTicketMovieTitle() {
        return ticketMovieTitle;
    }

    public void setTicketMovieTitle(String ticketMovieTitle) {
        this.ticketMovieTitle = ticketMovieTitle;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

