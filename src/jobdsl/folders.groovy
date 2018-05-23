import javaposse.jobdsl.dsl.DslFactory

def factory = this as DslFactory
factory.folder("test") {
    description "<hr><center><h3>test</h3></center><hr>"
}
