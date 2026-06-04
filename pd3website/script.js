
let Data,selling;

async function init(){
  let link = "https://psychic-pancake-q74qr4wq4gqwh5p9-8500.app.github.dev";
  let route= "/selling"
  info = await fetch(link+route);
  Data = await info.json();
  console.log(Data);
  generatecards(Data);
  }

 function generatecards(selling){ 
  let back="";
  let front="";
  
  for(let i=0; i<selling.length; i++){
    let sell = selling[i];
    front = `<h2>${sell.Typeofcars}</h2>`;
    front += `<img src='Images/${sell.Images}.jpg'>`

    back = `<p> car sales person: ${sell.carsalesperson}</p>`;
    back+= `<p> cars sold: ${sell.Carssold}</p>`;
    back+= `<p> Date they sold car : ${sell.Datetheysoldcar}</p>`;
    back+= `<hr>`;

    card = new FlipCard(front,back);
    card.render("flipcard_output");
  }
}
