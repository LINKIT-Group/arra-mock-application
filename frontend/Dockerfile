FROM nginx

LABEL vendor=LINKIT \
      nl.linkit.arra.is-beta="false" \
      nl.linkit.arra.is-production="true" \
      nl.linkit.arra.version="0.0.1" \
      nl.linkit.arra.release-date="01-11-2017"

ENV PORT=80 \
    SERVER_STATELESS=http://stateless \
    SERVER_STATEFUL=http://stateful

COPY dist /usr/share/nginx/html
COPY docker/default.conf.template /etc/nginx/conf.d/default.conf.template

CMD ["/bin/bash", "-c", "envsubst < /etc/nginx/conf.d/default.conf.template > /etc/nginx/conf.d/default.conf && nginx -g 'daemon off;'"]
