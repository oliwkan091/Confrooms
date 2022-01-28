package pl.polsl.confrooms.model.ConferenceRoom.Responses;

import lombok.AllArgsConstructor;

//ODPOWIEDZ SERWERA NA ZAPYTANIE DODANIA SALI KONFERENCYJNEJ
@AllArgsConstructor
public class ConferenceRoomAddResponse {
    public String title;
    public String text;
}
