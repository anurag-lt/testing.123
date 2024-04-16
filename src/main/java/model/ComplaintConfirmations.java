package model;

import java.sql.Timestamp;

/**
 * Represents the confirmation process for a complaint within the system.
 * It tracks when a complaint has been confirmed by the user, including a unique confirmation code and the date of confirmation.
 */
public class ComplaintConfirmations {

    /**
     * Unique identifier for each complaint confirmation.
     */
    private int id;

    /**
     * A unique code generated for the confirmation process of a complaint.
     */
    private String confirmationCode;

    /**
     * The timestamp marking when the complaint was confirmed by the user.
     */
    private Timestamp dateConfirmed;

    /**
     * Links back to the specific complaint that is being confirmed.
     */
    private Complaints complaints;

    /**
     * Gets the unique identifier for the complaint confirmation.
     * @return The unique identifier.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the complaint confirmation.
     * @param id The unique identifier.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the unique confirmation code associated with the complaint confirmation.
     * @return The unique confirmation code.
     */
    public String getConfirmationCode() {
        return confirmationCode;
    }

    /**
     * Sets the unique confirmation code for the complaint confirmation.
     * @param confirmationCode The unique confirmation code.
     */
    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

    /**
     * Gets the timestamp when the complaint was confirmed by the user.
     * @return The date and time of confirmation.
     */
    public Timestamp getDateConfirmed() {
        return dateConfirmed;
    }

    /**
     * Sets the timestamp marking when the complaint was confirmed by the user.
     * @param dateConfirmed The date and time of confirmation.
     */
    public void setDateConfirmed(Timestamp dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    /**
     * Gets the complaint that is linked to this confirmation.
     * @return The linked complaint.
     */
    public Complaints getComplaints() {
        return complaints;
    }

    /**
     * Sets the complaint which this confirmation refers to.
     * @param complaints The complaint being confirmed.
     */
    public void setComplaints(Complaints complaints) {
        this.complaints = complaints;
    }

    /**
     * Provides a string representation of a complaint confirmation record.
     * @return A string that represents the complaint confirmation.
     */
    @Override
    public String toString() {
        return "ComplaintConfirmations{" +
               "id=" + id +
               ", confirmationCode='" + confirmationCode + '\'' +
               ", dateConfirmed=" + dateConfirmed +
               ", complaints=" + (complaints != null ? complaints.getId() : null) +
               '}';
    }
}