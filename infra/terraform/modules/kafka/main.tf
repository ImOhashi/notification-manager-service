resource "kafka_topic" "email_service_topic" {
  name               = var.email_service_topic_name
  partitions         = var.email_service_topic_partitions
  replication_factor = var.email_service_topic_replication_factor
}