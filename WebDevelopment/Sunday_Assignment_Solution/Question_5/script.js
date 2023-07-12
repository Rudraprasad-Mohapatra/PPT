function validateForm(event) {
    event.preventDefault();

    // Get form field values
    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let phone = document.getElementById("phone").value;
    let password = document.getElementById("password").value;
    let age = document.getElementById("age").value;
    let gender = document.getElementById("gender").value;
    let date = document.getElementById("date").value;
    let color = document.getElementById("color").value;

    // Validate name (non-empty)
    if (name === "") {
        showError("name", "Name is required");
        return false;
    }

    // Validate email
    if (!validateEmail(email)) {
        showError("email", "Invalid email address");
        return false;
    }

    // Validate phone number (10 digits)
    if (!validatePhoneNumber(phone)) {
        showError("phone", "Invalid phone number");
        return false;
    }

    // Validate password (at least 8 characters)
    if (password.length < 8) {
        showError("password", "Password must be at least 8 characters long");
        return false;
    }

    // Validate age (must be a positive number)
    if (age <= 0) {
        showError("age", "Age must be a positive number");
        return false;
    }
    // Validate gender (must be selected)
    if (gender === "") {
        showError("gender", "Gender must be selected");
        return false;
    }

    // Validate date (must be in the past)
    var today = new Date().toISOString().slice(0, 10);
    if (date > today) {
        showError("date", "Invalid date");
        return false;
    }

    // Validation passed, submit the form
    alert("Form submitted successfully!");
    document.getElementById("myForm").reset(); // Reset form fields
    return true;
}

function showError(fieldId, errorMessage) {
    let field = document.getElementById(fieldId);
    field.classList.add("error");
    let errorSpan = document.createElement("span");
    errorSpan.classList.add("error");
    errorSpan.innerHTML = errorMessage;
    field.parentNode.insertBefore(errorSpan, field.nextSibling);
}

function validateEmail(email) {
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
}

function validatePhoneNumber(phone) {
    var phoneRegex = /^\d{10}$/;
    return phoneRegex.test(phone);
}