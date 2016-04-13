package Documentation;

/**
 * Created by Henrik on 12-04-2016.
 */
public class HenriksNotes
{
    /*

    ----------
    STRUKTUR OG FUNDAMENT:
    ----------

    3 faser:

    - Arrival-fasen:

    1 liste med 10 Queue objekter
        arrivalTrack1, arrivalTrack2, arrivalTrack3, arrivalTrack4, arrivalTrack5,
        arrivalTrack6, arrivalTrack7, arrivalTrack8, arrivalTrack9, arrivalTrack10

    Vi spawner vores Wagon objekter i disse k�er - vilk�rligt eller organiseret? Vi kan starte med at spawne 100 (10 i hver Queue, s� er de fulde),
    og eventuelt bare fylde p� som vi fjerner togene op i n�ste fase.


    - Sorting-fasen:

    1 Queue objekt
        sortingTrack

    Denne Queue modtager Wagon objekter fra vores Arrivals, grupperet sammen efter destination, og gerne s� logisk som muligt. Dette betyder, at vi skal kunne
    sl� indholdet af SAMTLIGE Queue-objekter op, og finde ud af hvad der passer bedst. Giver det mest mening at sende Wagon-objekterne videre fra Sorting til Departing?
    I s� fald, hvilken Queue passer s� bedst? Giver det mest mening at fylde mere p� Sorting? Eller skal vi rykke vores Wagon-objekter fra Sorting til Scratch, for at
    l�gge det bagerst i Sorting p� et senere tidspunkt igen?


    - Departure-fasen:

    9 Queue objekter:
        departureTrack1, departureTrack2, departureTrack3, departureTrack4, departureTrack5, departureTrack6, departureTrack7, departureTrack8
        scratchTrack

    De 8 departureTrack Queue-objekter, symboliserer de 8 spor hvor vi kan fylde vores togvogne p�, og sende ud i verden. Alle Queue-objekter er dynamiske,
    hvilket betyder de kan bruges til alle afgangene fleksibelt, alt afh�gngigt af behovet. Denne fase indeholder ogs� vores scratchTrack Queue, som giver os
    mulighed for at sende tog tilbage bagerst i sortingTrack Queue-objektet, s�fremt der er plads til det, og det giver mening at gruppere Wagon-objekterne
    sammen der.



    ----------
    NEDBRYDNING AF LOGIK:
    ----------

    Udgangspunktet m� v�re, at gruppere Wagon-objekterne fra ArrivalTracks sammen s� vidt muligt, ud fra en logisk forfordeling. Dette kr�ver, at vi kigger p� indholdet
    i alle vores DepartureTracks, og finder ud af om der enten er en tom k� vi kan l�gge noget i, eller om en af k�erne indeholder noget identisk med det vi har til r�dighed.

    Jeg foresl�r, at vi laver 3 ( 5? ) lister, med de ruter vi kan fylde tog p�, nemlig:
        {"Hamburg Harbour"}
        {"Scandinavia"}
        {"Duisburg", "Koln", "Stuttgart", "Munich"}
        {"Berlin", "Leipzig", Nurnberg", "Munich"}
        {"Hannover", "Kassel", "Frankfurt", "Stuttgart", "Munich"}



    ----------
    RANDOM NOTES:
    ----------

    Stuttgart, Munchen, Harbor, og Scandinavia er alle komplicerede at arbejde med - de to f�rste grundet flere linjer der har dem som stop, de to sidste fordi de vil l�se et spor
    fuldst�ndigt for andre togvogne indtil k�en bliver t�mt igen.



    ----------
    GAMLE NOTER:
    ----------

    Opret en liste (masterList) over alle 9 Queue objekter.
    Disse Queue objekter skal kopieres over i en ny liste (sortingList) over Queue-objekter, s�fremt at de overholder der regler vi opretter for sorteringen.

    N�r der kun er 1 mulighed tilbage i sortingList, s� skal togvognen s�ttes ind i denne Queue. Listen skal cleares, og masterList skal kopieres over i sortingList igen.

    Default skal s�ttes til trackScratch, s� en togvogn altid vil blive sat ind der s�fremt den ikke lever op til andre regler.

    Pseudo kode:

    if ( togvognens destination IKKE .equals destinationen p� det sidst ankomne tog i en k�  )
        Fjern Queue fra sortingList

    if ( k�en IKKE er tom )

    if (  )



     */
}
