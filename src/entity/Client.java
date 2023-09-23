package entity;

import java.util.Objects;

public class Client {

    private long clientId;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    protected Client() {
    }

    public Client(long clientId, String firstName, String lastName, String address, String phone, String email) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public long getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientId == client.clientId && Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName)
                && Objects.equals(address, client.address) && Objects.equals(phone, client.phone) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, firstName, lastName, address, phone, email);
    }

    @Override
    public String toString() {
        return "Client[" +
                "clientId=" + clientId + ", firstName=" + firstName  + ", lastName=" + lastName  + ", address=" + address +
                ", phone=" + phone + ", email=" + email  + ']';
    }
}
