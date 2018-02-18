grep -e first_name -e last_name -e patient_uid -e date_of_birth $1 | sed 's/patient_uid/external_uid/' |sed '/date_of_birth/s/,/}/' | sed 's/"first_name"/{"first_name"/'
