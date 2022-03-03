/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.builder.chain;

/**
 *
 * @author Claudio
 */
public class Account {

    private int userId;
    private String token;

    private Account() {
        //private constructor
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    public static Builder newBuilder() {
        return new Account().new Builder();
    }

    @Override
    public String toString() {
        return "Account [userId=" + userId + " ,token=" + token + "]";
    }

    class Builder {

        private Builder() {
        }

        public Builder setUserId(int userId) {
            Account.this.userId = userId;
            return this;
        }

        public Builder setToken(String token) {
            Account.this.token = token;
            return this;
        }

        public Account build() {
            return Account.this;
        }
    }
}
