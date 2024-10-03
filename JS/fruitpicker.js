
// import { notify } from './notifier';
// import { order } from './grocer';

function onSuccess() {
  notify({ message: 'SUCCESS' });
}

function onError() {
  notify({ message: 'ERROR' });
}

function orderFromGrocer(query, onSuccessCallback, onErrorCallback) {
   order(query, onSuccessCallback, onErrorCallback);
  
}

function postOrder(variety, quantity) {

  const query = {
    variety,
    quantity
  };

  orderFromGrocer(query, onSuccess, onError);
}
