{{- define "chatbot.name" -}}
chatbot-api
{{- end -}}

{{- define "chatbot.fullname" -}}
chatbot-api
{{- end -}}

{{- define "chatbot.serviceAccountName" -}}
chatbot-api-svc-account
{{- end -}}

{{- define "chatbot.labels" -}}
name: {{ .Chart.Name }}
version: "{{ .Chart.AppVersion }}"
{{- end -}}

{{- define "chatbot.selectorLabels" -}}
app: chatbot-api
{{- end -}}
