const rolForm = document.getElementById("rolForm");
    const estudianteForm = document.getElementById("estudianteForm");
    const docenteForm = document.getElementById("docenteForm");

    rolForm.addEventListener("change", function () {
        const selectedRol = document.querySelector('input[name="rol"]:checked').value;

        if (selectedRol === "estudiante") {
            estudianteForm.style.display = "block";
            docenteForm.style.display = "none";
        } else if (selectedRol === "docente") {
            estudianteForm.style.display = "none";
            docenteForm.style.display = "block";
        }
    });