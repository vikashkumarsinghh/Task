let display = document.getElementById('display');
let buttons = Array.from(document.getElementsByClassName('button'));
buttons.map(button => {
  button.addEventListener('click', (e) => {
    switch (e.target.innerText) {
      case 'AC':
        display.innerText = '';
        break;
      case '=':
        try {
          display.innerText = eval(display.innerText);
        }
        catch {
          display.innerText = "Error"
        }
        break;
      default:
        display.innerText += e.target.innerText;
    }
  });
});
document.addEventListener('keyup', (e) => {
  if (((e.which >= 48 && e.which <= 57) || (e.which >= 96 && e.which <= 111) || (e.which >= 189 && e.which <= 191)) && !e.shiftKey) {
    display.innerText += e.key;
  }
  if (e.shiftKey && (e.which == 187 || e.which == 48 || e.which == 56 || e.which == 57 || e.which == 53)) {
    display.innerText += e.key;
  }
  if (e.which == 54 && e.shiftKey) {
    display.innerText += "**";
  }
  if (e.which == 13) {
    try {
      display.innerText = eval(display.innerText);
    }
    catch {
      display.innerText = "Error"
    }
  }
  if (e.which == 8) {
    display.innerText = display.innerText.slice(0, -1);
  }
  if (e.which == 46) {
    display.innerText = "";
  }
})