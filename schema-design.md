# Smart Clinic Management System – Database Schema

## Doctor Table
| Column Name | Data Type | Description |
|-------------|-----------|-------------|
| doctor_id | INT (PK) | Unique ID for each doctor |
| name | VARCHAR(100) | Doctor name |
| speciality | VARCHAR(100) | Doctor specialization |
| email | VARCHAR(100) | Doctor email |

PRIMARY KEY (doctor_id)

---

## Patient Table
| Column Name | Data Type | Description |
|-------------|-----------|-------------|
| patient_id | INT (PK) | Unique ID for each patient |
| name | VARCHAR(100) | Patient name |
| email | VARCHAR(100) | Patient email |
| phone | VARCHAR(20) | Patient phone number |

PRIMARY KEY (patient_id)

---

## Appointment Table
| Column Name | Data Type | Description |
|-------------|-----------|-------------|
| appointment_id | INT (PK) | Unique appointment ID |
| doctor_id | INT (FK) | Reference to Doctor |
| patient_id | INT (FK) | Reference to Patient |
| appointment_time | DATETIME | Appointment date and time |
| status | VARCHAR(20) | Appointment status |

PRIMARY KEY (appointment_id)

FOREIGN KEY (doctor_id) REFERENCES Doctor(doctor_id)

FOREIGN KEY (patient_id) REFERENCES Patient(patient_id)

---

## Prescription Table
| Column Name | Data Type | Description |
|-------------|-----------|-------------|
| prescription_id | INT (PK) | Unique prescription ID |
| appointment_id | INT (FK) | Reference to Appointment |
| notes | TEXT | Doctor prescription notes |

PRIMARY KEY (prescription_id)

FOREIGN KEY (appointment_id) REFERENCES Appointment(appointment_id)

