function createVisitor(name, age, ticketId) {
    const visitor = {
        'name': name,
        'age': age,
        'ticketId': ticketId
    }
    return visitor
}

const visitor = createVisitor("geo", 39, "H54785")

function revokeTicket(visitor) {
    visitor.ticketId = null
    return visitor
}



function ticketStatus(tickets, ticketId) {

    if (!(ticketId in tickets)) {
        return "unknown ticket id"; 
    }

    if (tickets[ticketId] === null) {
        return "not sold"
    } else {
        return "sold to " + tickets[ticketId]
    }
}


function gtcVersion(visitor) {
    if (visitor.gtc === undefined){
        return visitor.gtc
    } else {
        return visitor.gtc.version
    }
  }

  const visitorNew = {
    name: 'Verena Nardi',
    age: 45,
    ticketId: 'H32AZ123',
    gtc: {
      signed: true,
      version: '2.1',
    },
  };
  
  gtcVersion(visitorNew);
  // => '2.1'
  
  const visitorOld = {
    name: 'Verena Nardi',
    age: 45,
    ticketId: 'H32AZ123',
  };
  
  gtcVersion(visitorOld);
  // => undefined