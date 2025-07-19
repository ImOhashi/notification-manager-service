module "kafka" {
  source                                 = "./modules/kafka"
  email_service_topic_name               = var.email_service_topic_name
  email_service_topic_partitions         = var.email_service_topic_partitions
  email_service_topic_replication_factor = var.email_service_topic_replication_factor
}
