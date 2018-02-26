# Mercado Libre Java SDK

## Description

A real Java SDK for working with the Mercado Libre API.

## 💾 Installation


## 💼 Usage

The SDK consists on isolated services. 

For example, lets take a look on how to use the `CategoryService` to fetch all available categories in MLA.

```
CategoryService service = new CategoryService();
Either<Category[], Error> response = service.getAllCategories(MercadoLibre.Site.MLA);

if (response.isValuePresent()) {
    // Prints the first category
    System.out.println(response.getValue()[0]);
} else {
    // Prints the error, if any
    System.out.println(response.getAlternative());
}
```

Authenticating is super easy with the `AuthenticationService`!

```
AuthenticationService service = new AuthenticationService(clientId, clientSecret);
Either<Authentication, Error> response = service.authorize(serverCode, redirectUri);

if (response.isValuePresent()) {
    // Here we get the access token!
    System.out.println(response.getValue().getAccessToken());
} else {
    // Printing the error in case of failure
    System.out.println(response.getAlternative());
}
```

## 🔎 Scope

Current supported services are:

* Authentication
* Categories
* Items
* User

Feel free to submit a **PR** if the current implementation does not suffice your needs.

## ❤️ Credits

### 📚 Dependencies

[Google GSON](https://github.com/google/gson)

[Square OkHttp](https://github.com/square/okhttp)

### 👤 Authors

[Tomi De Lucca](https://twitter.com/tomidelucca)

## 🎓 License

[MIT](http://webpro.mit-license.org/)
