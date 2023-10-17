$(document).ready(function () {
  $("#surveyForm").submit(function (e) {
    e.preventDefault();

    const formValues = {
      "First Name": $("#firstName").val(),
      "Last Name": $("#lastName").val(),
      "Date of Birth": $("#dob").val(),
      Country: $("#country option:selected").text(),
      Gender: $("input[type=checkbox]:checked")
        .map(function () {
          return $(this).val();
        })
        .get()
        .join(", "),
      Profession: $("#profession").val(),
      Email: $("#email").val(),
      "Mobile Number": $("#mobile").val(),
    };

    let formValuesHtml = "<ul>";
    for (const [label, value] of Object.entries(formValues)) {
      formValuesHtml += `<li><strong>${label}:</strong> ${value}</li>`;
    }

    formValuesHtml += "</ul>";
    $("#formValues").html(formValuesHtml);

    $("#formValuesModal").modal("show");
  });

  $("#resetButton").click(function () {
    $("#surveyForm")[0].reset();
  });

  $("#closeModal").click(function () {
    $("#surveyForm")[0].reset();
  });
});
