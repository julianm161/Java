let data,Customers;

  async function init(){
  let link = "https://psychic-pancake-q74qr4wq4gqwh5p9-8500.app.github.dev";
  let route= "/Custom"
  info = await fetch(link+route);
  data = await info.json();
  console.log(data);
  generatecards(data);
}

function generatecards(Custom){
  let centerpanel = document.getElementById("centerpanel");
  let build ="";

  for(let i=0; i<Custom.length; i++){
    let custo = Custom[i]
    build += `<div class="card" >`
    build += `<h3> Customer: ${custo.Customer}</h3>`;
    build += `<div> Payment type: ${custo.Paymenttype}</div>`;
    build += `<div> type of car they bought: ${custo.TypeofcartheyBought}</div>`;
    build += `<div> Car Price: ${custo.CarPrice}</div>`;
    build += `<hr>`;
    build += `</div>`;
  }

  // Now inject the build content into the output container
  centerpanel.innerHTML = build;
  

}


function filter(){
  let card = document.getElementById("card").value;
  console.log(card);
  Custom = data;
  let cardlist = []; 
  
  for(let i=0; i<Custom.length; i++){
    let custo = Custom[i] 
    
    if( custo.Paymenttype == card) {
        
          cardlist.push(custo);
       }
  }
  console.log(`number found ${cardlist.length}`)
  generatecards(cardlist);
  
}