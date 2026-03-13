# Demo DATA1700 - fullstack development.
This repo contains a template and materials for a demo in simple fullstack development.

The demo focuses on understanding of the underlying HTTP-requests that are built, sent and received by Spring Boot and JavaScript.

## License
The source code in this repository is licensed under the [MIT License](LICENSE).
The slide materials in `demo_materials` are licensed under [CC BY 4.0](demo_materials/LICENSE).

The demo materials can be found in `demo_materials`.

You can switch to a branch that starts where the demo leaves off like so: `git checkout solution`.

## Tasks
The following tasks are meant to be completed after the demo. They practice fundamental fullstack develolment skills with REST APIs and build understanding.

1. Write java code so that a random of 3 quotes is returned when someone sends GET /quote to the server.
Here is an example of a response object:
```json
{
  "quote": "Talk is cheap. Show me the code.",
  "author": "Linus Torvalds"
}
```

2. Add a CSS file, a JS file and an image in index.html (served by Spring Boot!). Without looking in the network tab, how many total HTTP requests are made to the server when the page loads in a browser?

3. Write an HTML form that “sends a question to customer support”. (form fields: name, phone number, question). What happens by default when you hit a button with `type=submit` within a form?

4. Research the `action` attribute of HTML form. Try to send a POST request with JS and fetch instead of having the form do it automatically.

5. Specify in Spring Boot how it should handle the POST requests from the form. Make a GET endpoint that returns all the questions people sent in (intended for use by staff).

6. Discuss with the person next to you what the following statements mean and wether they are true. Why are they true/false?:
  - HTTP is stateless.
  - AJAX is better for UX.
  - AJAX and CSR is the same thing.
  - CSR is bad for SEO.
  - SSR requires hydration.

Dictionary:
| Abbreviation | Term |
| --- | --- |
| HTTP | Hyper-Text-Transfer-Protocol |
| AJAX | Asynchronous Javascript And Xml |
| UX | User eXperience |
| CSR | Client Side Rendering |
| SSR | Server Side Rendering |