function validateForm() {
  const name = document.querySelector('[th\\:field="*{name}"]');
  const price = document.querySelector('[th\\:field="*{price}"]');
  let valid = true;

  document.getElementById('error-name').style.visibility = 'hidden';
  document.getElementById('error-price').style.visibility = 'hidden';

  if (!name.value.trim()) {
    document.getElementById('error-name').textContent = 'Please enter your name.';
    document.getElementById('error-name').style.visibility = 'visible';
    valid = false;
  }

  if (!price.value || price.value <= 0) {
    document.getElementById('error-price').textContent = 'Please enter a valid price.';
    document.getElementById('error-price').style.visibility = 'visible';
    valid = false;
  }

  return valid;
}
