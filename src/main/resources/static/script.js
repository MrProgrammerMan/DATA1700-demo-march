let btn = document.getElementById("btn")
btn.addEventListener("click", async () => {
    let response = await fetch("http://localhost:8080/stuff")

    let json_data = await response.json()

    console.log(json_data)

    let out = document.getElementById("out")
    out.innerText = json_data.Quote
})