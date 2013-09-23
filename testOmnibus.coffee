Omnibus = require('./omnibus.coffee')
should = require('chai').should()

describe 'Omnibus', ->
  it 'first open the door', ->
    elevator = new Omnibus
    elevator.next().should.equal 'OPEN'

  it 'go omnibus to the top and down 2 times', ->
    elevator = new Omnibus
    for x in [1..2]
      for j in [1..5]
        elevator.next().should.equal 'OPEN'
        elevator.next().should.equal 'CLOSE'
        elevator.next().should.equal 'UP'
      for j in [1..5]
        elevator.next().should.equal 'OPEN'
        elevator.next().should.equal 'CLOSE'
        elevator.next().should.equal 'DOWN'
