run:
	docker run -d --name ldap-mock -p 389:389 -p 636:636 thoteam/slapd-server-mock

stop:
	docker stop ldap-mock

remove: stop
	docker rm ldap-mock